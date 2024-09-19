package com.deloitte.lab5.ex3;

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}


class Employee {
	public String name;
	public double salary;
    public String designation;

    public Employee(String name, double salary, String designation) throws EmployeeException {
        this.name = name;
        if(salary <3000) {
        	throw new EmployeeException("Salary Cannot be less than 3000");
        }
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", Salary=" + salary + ", Designation=" + designation +"]";
    }
}


public class Lab5Ex3 {
    
    public static void main(String[] args) {
    	try {
            Employee e1 = new Employee("Emp1", 5000, "Intern");	
            System.out.println(e1.toString());
            Employee e2 = new Employee("Emp1", 1000, "Intern");
            System.out.println(e2.toString());
            
            
    	}
    	catch (EmployeeException e) {
    		System.out.println(e.getMessage());
    	}

    }
}

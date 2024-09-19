package com.deloitte.lab5.ex2;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class Employee {
	public String firstName,lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return firstName;
	}
	@Override
	public String toString() {
		return "Employee Name: "+firstName+" "+lastName;
	}
	Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

public class Lab5Ex2 {
    
	public static void validateName(Employee e) throws InvalidNameException {
        if (e.getFirstName().isBlank()) {
            throw new InvalidNameException("First Name cannot be blank");
        }
        if (e.getLastName().isBlank()) {
            throw new InvalidNameException("Last Name cannot be blank");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Shubham", "Jadhav");
        Employee e2 = new Employee("", "");
        

        try {
        	validateName(e1);
            System.out.println(e1.toString());
        	validateName(e2);
        	System.out.println(e2.toString());
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name: " + e.getMessage());
        }
    }
}

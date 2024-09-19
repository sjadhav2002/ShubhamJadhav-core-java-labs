package com.deloitte.lab4.ex2.bean;

public class Employee {

	public String name;
	public double salary;
    public String designation;
    public String insuranceScheme;

    public Employee(String name, double salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    public void setInsuranceScheme(String insuranceScheme) {
        this.insuranceScheme = insuranceScheme;
    }

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", Salary=" + salary + ", Designation=" + designation + ", Insurance Scheme=" + insuranceScheme + "]";
    }
}

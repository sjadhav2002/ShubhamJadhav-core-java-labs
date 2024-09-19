package com.deloitte.lab4.ex2.service;

import java.util.Scanner;

import com.deloitte.lab4.ex2.bean.Employee;

public class Services implements InsuranceInterface {

	@Override
	public Employee getEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		String name = scanner.nextLine();

		System.out.print("Enter employee salary: ");
		double salary = scanner.nextDouble();

		scanner.nextLine();

		System.out.print("Enter employee designation: ");
		String designation = scanner.nextLine();

		return new Employee(name, salary, designation);
	}

	@Override
	public String findInsuranceScheme(Employee employee) {
		double salary = employee.getSalary();
		String designation = employee.getDesignation();

		if (salary >= 50000 && designation.equalsIgnoreCase("Manager")) {
			return "Platinum";
		} else if (salary >= 30000 && salary < 50000 && designation.equalsIgnoreCase("Senior Developer")) {
			return "Gold";
		} else if (salary >= 20000 && salary < 30000 && designation.equalsIgnoreCase("Developer")) {
			return "Silver";
		} else if (salary < 20000) {
			return "Bronze";
		} else {
			return "No Scheme";
		}
	}
	
	@Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee);
    }

}
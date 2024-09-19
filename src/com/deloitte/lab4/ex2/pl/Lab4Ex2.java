package com.deloitte.lab4.ex2.pl;

import com.deloitte.lab4.ex2.bean.Employee;
import com.deloitte.lab4.ex2.service.InsuranceInterface;
import com.deloitte.lab4.ex2.service.Services;

public class Lab4Ex2 {

	public static void main(String[] args) {
        InsuranceInterface employeeService = new Services();

        Employee employee = employeeService.getEmployeeDetails();

        String insuranceScheme = employeeService.findInsuranceScheme(employee);
        employee.setInsuranceScheme(insuranceScheme);

        employeeService.displayEmployeeDetails(employee);
    }

}

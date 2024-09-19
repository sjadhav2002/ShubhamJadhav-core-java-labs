package com.deloitte.lab4.ex2.service;

import com.deloitte.lab4.ex2.bean.Employee;

public interface InsuranceInterface {
	    Employee getEmployeeDetails();
	    String findInsuranceScheme(Employee employee);
	    void displayEmployeeDetails(Employee employee);
	}



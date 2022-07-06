package com.sujata.service;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;

public interface EmployeeService {

	Employee[] getAllEmployees();
	Employee searchEmployeeById(int employeeId);
	EmployeePayslip generatePayslip(int employeeId);
}

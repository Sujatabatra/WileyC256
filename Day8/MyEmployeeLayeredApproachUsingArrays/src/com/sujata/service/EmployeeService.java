package com.sujata.service;

import com.sujata.bean.Employee;

public interface EmployeeService {

	Employee[] getAllEmployees();
	Employee searchEmployeeById(int employeeId);
}

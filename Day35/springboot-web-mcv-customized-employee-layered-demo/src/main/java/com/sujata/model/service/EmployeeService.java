package com.sujata.model.service;

import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Employee searchEmployeeById(int employeeId);
	EmployeePayslip generatePayslip(int employeeId);
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int employeeId);
}

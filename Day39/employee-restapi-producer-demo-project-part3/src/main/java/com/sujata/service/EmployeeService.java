package com.sujata.service;

import java.util.List;
import java.util.Optional;

import com.sujata.bean.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	Optional<Employee> searchEmployeeByID(int id);
	
	Employee saveEmployee(Employee employee);
	
	Employee deleteEmployee(int id);
	
	Employee updateSalary(int id,double sal);
	
}

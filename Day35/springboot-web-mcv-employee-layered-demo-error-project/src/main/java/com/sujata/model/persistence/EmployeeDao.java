package com.sujata.model.persistence;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	int addRecord(Employee employee);
	int deleteRecord(int empId);
	Employee searchRecord(int empId);
	List<Employee> getAllRecords();
	
}

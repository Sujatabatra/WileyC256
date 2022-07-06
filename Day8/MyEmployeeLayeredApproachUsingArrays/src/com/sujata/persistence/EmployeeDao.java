package com.sujata.persistence;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	boolean addRecord(Employee employee);
	boolean deleteRecord(int empId);
	Employee searchRecord(int empId);
	Employee[] getAllRecords();
	
}

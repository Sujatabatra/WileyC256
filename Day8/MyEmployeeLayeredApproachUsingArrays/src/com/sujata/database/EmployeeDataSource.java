package com.sujata.database;

import com.sujata.bean.Employee;

public class EmployeeDataSource {

	private static Employee[] employeeList=new Employee[10];
	static {
		employeeList[0]= new Employee(101, "AAAA", "Associate", "IT", 35000);
		employeeList[1]=new Employee(102, "BBBBB", "Executive", "Sales", 15000);
		employeeList[2]=new Employee(103, "CCCC", "Manager", "Sales", 95000);
		employeeList[3]=new Employee(104, "DDDD", "Sr. Manager", "IT", 175000);
	}
	public static Employee[] getEmployeeList() {
		return employeeList;
	}
	public static void setEmployeeList(Employee[] employeeList) {
		EmployeeDataSource.employeeList = employeeList;
	}

	
	
}

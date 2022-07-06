package com.sujata.persistence;

import com.sujata.bean.Employee;
import com.sujata.database.EmployeeDataSource;

public class EmployeeDaoImpl implements EmployeeDao {

	
	@Override
	public boolean addRecord(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRecord(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee searchRecord(int empId) {
		Employee[] employees=EmployeeDataSource.getEmployeeList();
		for(int index=0;index<employees.length&&employees[index]!=null;index++) {
			if(employees[index].getEmpId()==empId)
				return employees[index];
		}
		return null;
	}

	@Override
	public Employee[] getAllRecords() {
		return EmployeeDataSource.getEmployeeList();
	}

}

package com.sujata.model.persistence.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int id = resultSet.getInt("employeeId");
		String name = resultSet.getString("employeeName");
		String desig = resultSet.getString("designation");
		String email = resultSet.getString("email");
		String deptt = resultSet.getString("department");
		double sal = resultSet.getDouble("salary");

		Employee employee = new Employee(id, name, desig, deptt, email, sal);
		return employee;
	}

}

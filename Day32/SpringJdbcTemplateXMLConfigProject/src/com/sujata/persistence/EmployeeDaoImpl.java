package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sujata.bean.Employee;
import com.sujata.persistence.helper.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addRecord(Employee employee) {
		String query = "INSERT INTO EMPLOYEE values(?,?,?,?,?,?)";

		int rows = jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(),
				employee.getEmpEmail(), employee.getEmpDepartment(), employee.getEmpSalary());

		return rows;
	}

	@Override
	public int deleteRecord(int empId) {
		String query = "DELETE FROM EMPLOYEE where employeeId=?";

		int rows = jdbcTemplate.update(query, empId);

		return rows;
	}

	@Override
	public Employee searchRecord(int empId) {
		Employee employee=null;
		try {
		String query="SELECT * FROM EMPLOYEE where EMPLOYEEID=?";
		employee=jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), empId);
		}
		catch(EmptyResultDataAccessException ex) {
			return employee;
		}
		return employee;
	}

	@Override
	public List<Employee> getAllRecords() {
		String query="SELECT * FROM EMPLOYEE";
		List<Employee> empList=jdbcTemplate.query(query, new EmployeeRowMapper());
		
		return empList;

	}

}

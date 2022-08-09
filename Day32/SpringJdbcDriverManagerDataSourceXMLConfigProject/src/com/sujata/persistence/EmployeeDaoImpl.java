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

import com.sujata.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	
	private DataSource dataSource;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public int addRecord(Employee employee) {
		int rows = 0;
		try (Connection connection = dataSource.getConnection();
				PreparedStatement preparedStatement = connection
						.prepareStatement("INSERT INTO EMPLOYEE values(?,?,?,?,?,?)");) {

			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getEmpDesignation());
			preparedStatement.setString(4, employee.getEmpEmail());
			preparedStatement.setString(5, employee.getEmpDepartment());
			preparedStatement.setDouble(6, employee.getEmpSalary());

			rows = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rows;
	}

	@Override
	public int deleteRecord(int empId) {

		return -1;
	}

	@Override
	public Employee searchRecord(int empId) {
		Employee employee = null;
		try (Connection connection = dataSource.getConnection();
				PreparedStatement preparedStatement = connection
						.prepareStatement("SELECT * FROM EMPLOYEE where EMPLOYEEID=?");) {

			preparedStatement.setInt(1, empId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int id = resultSet.getInt("employeeId");
				String name = resultSet.getString("employeeName");
				String desig = resultSet.getString("designation");
				String email = resultSet.getString("email");
				String deptt = resultSet.getString("department");
				double sal = resultSet.getDouble("salary");

				employee = new Employee(id, name, desig, deptt, email, sal);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public List<Employee> getAllRecords() {
		List<Employee> empList = new ArrayList<Employee>();
		try (Connection connection = dataSource.getConnection(); 
				Statement statement = connection.createStatement();) {

			ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");

			while (resultSet.next()) {
				int id = resultSet.getInt("employeeId");
				String name = resultSet.getString("employeeName");
				String desig = resultSet.getString("designation");
				String email = resultSet.getString("email");
				String deptt = resultSet.getString("department");
				double sal = resultSet.getDouble("salary");

				empList.add(new Employee(id, name, desig, deptt, email, sal));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return empList;

	}

}

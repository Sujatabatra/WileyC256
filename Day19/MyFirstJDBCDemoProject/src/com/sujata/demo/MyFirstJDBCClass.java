package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBCClass {

	public static void main(String[] args) {

		Connection connection=null;
		Statement statement=null;
		
		try {
//			1. Connect
//			1.1 Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to the database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc256", "root", "sujata");
			
//			2.Query
			statement=connection.createStatement();
			
			//DQL Statement
			ResultSet resultSet= statement.executeQuery("SELECT * FROM EMPLOYEE");
			
//			3.Process Result
			while(resultSet.next()) {
				int id=resultSet.getInt("employeeId");
				String name=resultSet.getString("employeeName");
				String desig=resultSet.getString("designation");
				String email=resultSet.getString("email");
				String deptt=resultSet.getString("department");
				double sal=resultSet.getDouble("salary");
				
				System.out.println(id+" "+name+" "+desig+" "+deptt+" "+email+" "+sal);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
//			4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

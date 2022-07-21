package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyModifiedFirstJDBCClass {

	public static void main(String[] args) {

		try( Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc256", "root", "sujata");
				Statement statement=connection.createStatement();	) {

			ResultSet resultSet= statement.executeQuery("SELECT * FROM EMPLOYEE");
			
			while(resultSet.next()) {
				int id=resultSet.getInt("employeeId");
				String name=resultSet.getString("employeeName");
				String desig=resultSet.getString("designation");
				String email=resultSet.getString("email");
				String deptt=resultSet.getString("department");
				double sal=resultSet.getDouble("salary");
				
				System.out.println(id+" "+name+" "+desig+" "+deptt+" "+email+" "+sal);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}

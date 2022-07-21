package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyThirdJDBCClass {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to the database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc256", "root", "sujata");
			
//			2.Query
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE values(?,?,?,?,?,?);");

			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name=scanner.next();
			System.out.println("Enter Employee Designation : ");
			String desig=scanner.next();
			System.out.println("Enter Employee Department : ");
			String deptt=scanner.next();
			System.out.println("Enter Employee Email : ");
			String email=scanner.next();
			System.out.println("Enter Employee Salary : ");
			double sal=scanner.nextDouble();
			
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, desig);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, deptt);
			preparedStatement.setDouble(6, sal);
			
			
			//DML Statement : executeUpdate()
			int rows=preparedStatement.executeUpdate();
			
			
//			3.Process Result
			if(rows>0)
				System.out.println("record inserted");
			else
				System.out.println("Employee cannnot be saved");
			
		} catch (ClassNotFoundException  e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Employee cannnot be saved");
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

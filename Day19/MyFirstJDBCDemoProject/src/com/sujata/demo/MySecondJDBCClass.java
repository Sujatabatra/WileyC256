package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySecondJDBCClass {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to the database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc256", "root", "sujata");
			
//			2.Query
			statement=connection.createStatement();

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
			
			String query="insert into employee values("+id+",'"+name+"','"+desig+"','"+email+"','"+deptt+"',"+sal+")";
			//DML Statement : executeUpdate()
			int rows=statement.executeUpdate(query);
			
			
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

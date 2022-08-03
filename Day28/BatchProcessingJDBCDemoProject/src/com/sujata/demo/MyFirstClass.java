package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstClass {

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
			statement.addBatch("insert into employee values(120,'Rakesh','Associate','ramesh@suresh.com','HR',45000)");
			statement.addBatch("insert into employee values(121,'Asha','Sr. Associate','asha@something.com','IT',65000)");
			statement.addBatch("insert into employee values(122,'Beena','Manager','beena@anymail.com','Sales',145000)");
			statement.addBatch("insert into employee values(123,'Chand','Associate','chand@somemail.com','IT',55000)");
			
//			3.Process Result
			
			int rows[]=statement.executeBatch();
			if(rows.length>0)
				System.out.println("Batch Processed");
			else
				System.out.println("Batch Not Processed");
			
			
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

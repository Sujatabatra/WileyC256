package com.sujata.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * CREATE DEFINER=`root`@`localhost` PROCEDURE `inputEmployeeRecord`(in id int,
in na varchar(25),
in des varchar(25),
in mailId varchar(25),
in deptt varchar(30),
in sal double)
BEGIN
insert into employee
values(id,na,des,mailId,deptt,sal);
END
 */
public class MyFirstClass {

	public static void main(String[] args) {
		Connection connection=null;
		CallableStatement callableStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to the database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc256", "root", "sujata");
			
//			2.Query
			callableStatement=connection.prepareCall("{call inputEmployeeRecord(?,?,?,?,?,?)}");
			
			System.out.println("Enter Employee ID : ");
			callableStatement.setInt(1, scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			callableStatement.setString(2, scanner.next());
			System.out.println("Enter Employee Designation : ");
			callableStatement.setString(3, scanner.next());
			System.out.println("Enter Employee Email : ");
			callableStatement.setString(4, scanner.next());
			System.out.println("Enter Employee Department : ");
			callableStatement.setString(5, scanner.next());
			System.out.println("Enter Employee Salary : ");
			callableStatement.setDouble(6, scanner.nextDouble());
			
			int rows=callableStatement.executeUpdate();
			
			if(rows>0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not Inserted");
			
//			3.Process Result
			
			
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

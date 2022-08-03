package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc256", "root", "sujata");
			
			connection.setAutoCommit(false);
			
			preparedStatement=connection.prepareStatement("UPDATE EMPLOYEE SET SALARY=SALARY+500 where EMPLOYEEID=?");
			System.out.println("Enter Employee ID for salary updation : ");
			int eid=scanner.nextInt();
			preparedStatement.setInt(1, eid);
			int rows=preparedStatement.executeUpdate();
			if(rows>0)
				System.out.println("Record Updated");
			else
				System.out.println("Record Not Updated");
			
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
			
			
			
			rows=preparedStatement.executeUpdate();
			
			if(rows>0)
				System.out.println("record inserted");
			else
				System.out.println("Employee cannnot be saved");
			
			connection.commit();
		} catch (ClassNotFoundException  e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println(e+" : "+e.getMessage());
			try {
				connection.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
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

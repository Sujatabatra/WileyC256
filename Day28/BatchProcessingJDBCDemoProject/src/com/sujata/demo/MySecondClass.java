package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MySecondClass {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Scanner scanner = new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			1.2 Connect to the database
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc256", "root", "sujata");

//			2.Query
			preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE values(?,?,?,?,?,?);");

			while (true) {
				System.out.println("Enter Employee ID : ");
				int id = scanner.nextInt();
				System.out.println("Enter Employee Name : ");
				String name = scanner.next();
				System.out.println("Enter Employee Designation : ");
				String desig = scanner.next();
				System.out.println("Enter Employee Department : ");
				String deptt = scanner.next();
				System.out.println("Enter Employee Email : ");
				String email = scanner.next();
				System.out.println("Enter Employee Salary : ");
				double sal = scanner.nextDouble();

				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, desig);
				preparedStatement.setString(4, email);
				preparedStatement.setString(5, deptt);
				preparedStatement.setDouble(6, sal);

				preparedStatement.addBatch();

				System.out.println("Press 1 to add more employees and 0 to exit");
				int choice = scanner.nextInt();
				if (choice == 0)
					break;
			}

			int rows[] = preparedStatement.executeBatch();

			int count = 1;
			for (int row : rows) {
				System.out.println("row(s) updated by " + count++ + " statement " + row);
			}
			if (rows.length > 0)
				System.out.println("Batch Processed");
			else
				System.out.println("Batch Not Processed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Employee cannnot be saved");
		} finally {
//			4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}

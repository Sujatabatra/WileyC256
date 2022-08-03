package com.sujata.demo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

/*
 * CREATE DEFINER=`root`@`localhost` PROCEDURE `getTotalEmployeesByDepartmentName`(in deptt varchar(30),
out totalEmp int)
BEGIN

select count(*) into totalEmp
from employee
where department=deptt;

END
 */
public class MySecondClass {

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
			callableStatement=connection.prepareCall("{call getTotalEmployeesByDepartmentName(?,?)}");
			
			System.out.println("Enter Employee Department : ");
			String dep=scanner.next();
			callableStatement.setString(1,dep );
			callableStatement.registerOutParameter(2, Types.INTEGER);
			
			callableStatement.execute();
			
			System.out.println("Total Employees working in "+dep+" departmment : "+callableStatement.getInt(2));
			
			
			
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

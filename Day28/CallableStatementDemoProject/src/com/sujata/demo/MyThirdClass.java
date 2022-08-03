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
 * CREATE DEFINER=`root`@`localhost` PROCEDURE `giveIncrement`(in id int)
BEGIN
declare desig varchar(30);
declare sal double;
declare incrementedSal double;

select designation,salary
into desig,sal
from employee
where employeeId=id;

case desig
when 'Manager' then
set incrementedSal=sal+.15*sal;
when 'Associate' then
set incrementedSal=sal+.10*sal;
when 'Clerk' then
set incrementedSal=sal+.8*sal;
else
set incrementedSal=sal;
end case;

update employee
set salary=incrementedSal
where employeeId=id;

select * from employee
where employeeId=id;
END
 */
public class MyThirdClass {

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
			callableStatement=connection.prepareCall("{call giveIncrement(?)}");
			
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			callableStatement.setInt(1,id );
			
			
			ResultSet rs= callableStatement.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("employeeName")+" "+rs.getDouble("salary"));
			}
			
			
			
			
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

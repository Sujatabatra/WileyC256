package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myjdbc.xml");
		EmployeePresentation employeePresentation=(EmployeePresentationImpl)applicationContext.getBean("employeePresentationImpl");
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
					
		}

	}

}

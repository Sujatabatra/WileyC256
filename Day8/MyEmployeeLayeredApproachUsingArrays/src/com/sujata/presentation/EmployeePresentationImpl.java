package com.sujata.presentation;

import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		try {
		switch (choice) {
		case 1:
			Employee[] employees=employeeService.getAllEmployees();
			for(Employee employee:employees) {
				System.out.println(employee.getEmpId()+"  "+employee.getEmpName());
			}
			break;

		case 2:
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			Employee empl=employeeService.searchEmployeeById(id);
			if(empl!=null) {
				System.out.println(empl.getEmpId()+"  "+empl.getEmpName());
			}
			else
				System.out.println("Employee with id "+id+" does not exist");
			break;
		case 3:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Coice");
			break;
		}
		}
		catch(Exception exception) {
			
		}
	}

}

package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Generate Payslip");
		System.out.println("4. Add New Employee ");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		try {
		switch (choice) {
		case 1:
			List<Employee> employees=employeeService.getAllEmployees();
			for(Employee employee:employees) {
				System.out.println(employee);
			}
			break;

		case 2:
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			Employee empl=employeeService.searchEmployeeById(id);
			if(empl!=null) {
				System.out.println(empl);
			}
			else
				System.out.println("Employee with id "+id+" does not exist");
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			int eid=scanner.nextInt();
			EmployeePayslip employeePayslip=employeeService.generatePayslip(eid);
			if(employeePayslip!=null)
				System.out.println(employeePayslip);
			else
				System.out.println("Employee with id "+eid+" does not exist");
			break;
		case 4:
			Employee employee=new Employee();
			System.out.println("Enter Employee ID : ");
			employee.setEmpId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			employee.setEmpName(scanner.next());
			System.out.println("Enter Employee Designation : ");
			employee.setEmpDesignation(scanner.next()); 
			System.out.println("Enter Employee Department : ");
			employee.setEmpDepartment(scanner.next()); 
			System.out.println("Enter Employee Email : ");
			employee.setEmpEmail(scanner.next());
			System.out.println("Enter Employee Salary : ");
			employee.setEmpSalary(scanner.nextDouble());
			if(employeeService.addEmployee(employee))
				System.out.println("Employee Record Added Successfully!");
			else
				System.out.println("Employee Record Insertion Failed");
			break;
		case 5:
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

package com.sujata.demo;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee(101, "AAAA", "Associate", "IT", 1234.56);
		System.out.println(employee);
		employee.setEmpName("Kavya");
		System.out.println(employee.getEmpName());

	}

}

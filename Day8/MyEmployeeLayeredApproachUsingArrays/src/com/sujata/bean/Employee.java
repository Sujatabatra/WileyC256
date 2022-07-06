package com.sujata.bean;

public class Employee {

	private int empId;
	private String empName;
	private String empDesignation;
	private String empDepartment;
	private double empSalary;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, String empDesignation, String empDepartment, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
}

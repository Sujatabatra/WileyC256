package com.sujata.bean;

public class EmployeePayslip {

	private Employee employee;
	private double hr;
	private double pf;
	private double da;
	private double totalSalary;
	
	public EmployeePayslip() {
		
	}

	public EmployeePayslip(Employee employee, double hr, double pf, double da, double totalSalary) {
		super();
		this.employee = employee;
		this.hr = hr;
		this.pf = pf;
		this.da = da;
		this.totalSalary = totalSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getHr() {
		return hr;
	}

	public void setHr(double hr) {
		this.hr = hr;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	
	
}

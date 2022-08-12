package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePayslip {

	private Employee employee;
	private double hr;
	private double pf;
	private double da;
	private double totalSalary;
		
	
}

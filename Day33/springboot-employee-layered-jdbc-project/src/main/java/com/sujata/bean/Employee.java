package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	private int empId;
	private String empName;
	private String empDesignation;
	private String empDepartment;
	private String empEmail;
	private double empSalary;
	
	
	
}

package com.sujata.bean;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {


	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String department;
	private String email;
	private double salary;
}

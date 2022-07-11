package com.sujata.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Data
public class Employee {
//	@Getter
//	@Setter
	private int empId;
//	@Getter
//	@Setter
	private String empName;
//	@Getter
//	@Setter
	private String empDesignation;
//	@Getter
//	@Setter
	private String empDepartment;
//	@Getter
//	@Setter
	private double empSalary;
	
}

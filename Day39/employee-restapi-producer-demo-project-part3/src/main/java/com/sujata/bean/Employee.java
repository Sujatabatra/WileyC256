package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	@Column(name = "designation")
	private String employeeDesignation;
	private String department;
	private String email;
	private double salary;
}

package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Student {

	@Id
	private String rollNo;
	private String studentName;
//	@ManyToOne
//	private Trainer teacher;
	
	public Student(String rollNo, String studentName) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
	}
	
	
}

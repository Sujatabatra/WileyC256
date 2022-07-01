package com.sujata.training;

import com.sujata.demo.Student;

public class Sports extends Student {

	private String sportsName;
	
	public void inputStudentsDetailsWithSports(int rollNo,String name,String sportsName) {
		inputStudentDetails(rollNo, name);
		this.sportsName=sportsName;
	}
	
	public void displayStudentDetailsWithSports() {
		displayStudentDetails();
		System.out.println("Sports Name : "+sportsName);
	}
}

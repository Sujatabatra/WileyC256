package com.sujata.training;

import com.sujata.demo.Student;

public class Sports extends Student {

	private String sportsName;
	
	public Sports() {
		System.out.println("Hi I am Sports Constructor");
	}
	
	//Method Overloading
	public void inputStudentsDetails(int rollNo,String name,String sportsName) {
		inputStudentDetails(rollNo, name);
		this.sportsName=sportsName;
	}
	
	//overriding
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Sports Name : "+sportsName);
	}
}

package com.sujata.training;

public class Grade extends Marks {

	private String grade;
	private double percentage;

//	public Grade() {
//		//implicit call goes to Parents class Default Constructor
//		/*
//		 * to explicitly call base class constructor, we use super keyword
//		 */
////		System.out.println("Hello");
//		super(0, 0, 0); //explicit call to parent(i.e Marks Class) constructor
//		System.out.println("Hi I am Grade Constructor");
//	}

	public Grade(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name, marks1, marks2, marks3);
	}

	public Grade() {
		super();
	}

	public String getGrade() {
		getPercentage();
		if (percentage > 75)
			grade = "A Grade";
		else
			grade = "b Grade";
		return grade;
	}

	public double getPercentage() {
		percentage = (getMarks1() + getMarks2() + getMarks3()) / 3;
		return percentage;
	}

	// Overriding
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Percentage : " + getPercentage());
		System.out.println("Grade : " + getGrade());
	}

}

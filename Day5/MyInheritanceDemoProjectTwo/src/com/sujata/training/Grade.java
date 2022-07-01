package com.sujata.training;

public class Grade extends Marks {

	private String grade;
	private double percentage;
	public String getGrade() {
		getPercentage();
		if(percentage>75)
			grade="A Grade";
		else
			grade="b Grade";
		return grade;
	}
	public double getPercentage() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		return percentage;
	}
	
	public void displayStudentCompleteDetails() {
		displayStudentDetailsWithMarks();
		System.out.println("Percentage : "+getPercentage());
		System.out.println("Grade : "+getGrade());
	}
	
	
}

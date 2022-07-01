package com.sujata.training;

import com.sujata.demo.Student;

public class Marks extends Student {

	private int marks1, marks2, marks3;

	public Marks() {
//		super();
	}

	public Marks(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	// method overloading
	public void inputStudentsDetails(int rollNo, String name, int marks1, int marks2, int marks3) {
		inputStudentDetails(rollNo, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	// overriding
	/*
	 * Method Overriding rule 1. over riding can happen when we want to change the
	 * behaviour of base class method in derived class 2.While overriding method
	 * name and signature must always be same. 3. we can broader the scope of method
	 * while overriding , we can't narrow down the scope or can override in same
	 * scope only
	 */
	public void displayStudentDetails() {
		super.displayStudentDetails(); // call the parent class version
		System.out.println("Marks 1 :" + marks1);
		System.out.println("Marks 2 :" + marks2);
		System.out.println("Marks 3 :" + marks3);
	}
}

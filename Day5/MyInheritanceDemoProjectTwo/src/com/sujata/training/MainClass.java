package com.sujata.training;

import com.sujata.demo.Student;

public class MainClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.inputStudentDetails(101, "AAAAA");
		student.displayStudentDetails();
		System.out.println("===========================");
		Marks marks=new Marks();
		marks.inputStudentsDetailsWithMarks(111, "AAAA", 67, 89, 94);
		marks.displayStudentDetailsWithMarks();
		
		System.out.println("=================");
		Grade grade=new Grade();
		grade.inputStudentsDetailsWithMarks(222, "BBBB", 90, 80, 97);
		grade.displayStudentCompleteDetails();
	}

}

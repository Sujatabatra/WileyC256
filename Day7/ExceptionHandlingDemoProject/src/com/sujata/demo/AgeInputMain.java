package com.sujata.demo;

import java.util.Scanner;

import com.sujata.xception.AgeCheckedException;
import com.sujata.xception.AgeUncheckedException;

public class AgeInputMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter Age : ");
		AgeInput ageInput1=new AgeInput(scanner.nextInt());
		System.out.println("Entered Age : "+ageInput1.getAge());
		
		System.out.println("Enter Age once Again : ");
		int age=scanner.nextInt();
		ageInput1.setAge(age);
		System.out.println("Re Entered Age : "+ageInput1.getAge());
		}
		catch(AgeCheckedException ageCheckedException) {
			System.out.println("Person not elegible for voting");
		}
		catch (AgeUncheckedException ageUncheckedException) {
			System.out.println("Person Not eligible for employement");
		}

	}

}

package com.sujata.demo;

import java.util.Scanner;

public class MySecondClass {

	public static void divide(int number1,int number2) {
		try {
		int result=number1/number2;
		System.out.println("Result : "+result);
		return;
		}
//		catch (NullPointerException e) {
//			System.out.println(e);
//		}
		finally {
			System.out.println("Hi I am finally block!");
		}
//		System.out.println("Good Bye from divide method");
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter first No : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second No : ");
		int number2=scanner.nextInt();
		
		divide(number1, number2);
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("undefined");
		}
		catch(Exception exception) {
			System.out.println("Something went wrong, please try after sometime!");
		}
		System.out.println("Good Bye from Main");

	}

}

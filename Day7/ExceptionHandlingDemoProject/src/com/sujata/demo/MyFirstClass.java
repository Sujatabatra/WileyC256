package com.sujata.demo;

import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int location=0;
		try {
		System.out.println("Enter First No. : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second No. : ");
		int number2=scanner.nextInt();
		
		int result=number1/number2;
		
		System.out.println("Result : "+result);
		
		int arr[];
		System.out.println("Enter total no of elements in an array : ");
		int total=scanner.nextInt();
		arr=new int[total];
		for(int index=0;index<total;index++) {
			System.out.println("Enter element for index "+index+" : ");
			arr[index]=scanner.nextInt();
		}
		
		System.out.println("Enter location in an array whoes value you want to view : ");
		location=scanner.nextInt();
		System.out.println("Value at location "+location+"in an array : "+arr[location]);
		}
		catch (ArithmeticException arithmeticException) {
			System.out.println("Undefined");
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println(location+" location doesnot exist in an array!");
		}
		catch(NegativeArraySizeException negativeArraySizeException) {
			System.out.println("Array Size cannot be Negative!");
		}
		catch(Exception exception) {
			System.out.println("Something went wrong , please try after sometime!");
		}
		finally {
			System.out.println("Hi I am finally Block!");
		}
		System.out.println("Good Bye from Main!");
	}

}

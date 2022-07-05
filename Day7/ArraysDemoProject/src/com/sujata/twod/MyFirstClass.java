package com.sujata.twod;

import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arr[][];
		
		System.out.println("Enter Total No of Rows : ");
		int rows=scanner.nextInt();
		System.out.println("Enter Total No of Columns : ");
		int cols=scanner.nextInt();
		
		arr=new int[rows][cols];
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.println("Enter element for row "+(row+1)+" col "+(col+1)+" : ");
				arr[row][col]=scanner.nextInt();
			}
		}
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.print(arr[row][col]+"     ");
			}
			System.out.println();
		}
		System.out.println("Traversal using for each");
		for(int ar[]:arr) {
			for(int element:ar) {
				System.out.print(element+"   ");
			}
			System.out.println();
		}

	}

}

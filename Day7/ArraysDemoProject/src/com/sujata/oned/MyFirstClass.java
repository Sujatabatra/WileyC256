package com.sujata.oned;

import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int arr[];
		
		System.out.println("Enter total no of elements in an array : ");
		int total=scanner.nextInt();
		
		arr=new int[total];
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter "+(index+1)+" Element : ");
			arr[index]=scanner.nextInt();
		}
		
		for(int index=0;index<total;index++) {
			System.out.println("ELement at index "+index+" : "+arr[index]);
		}
		
		for(int element:arr) {
			System.out.println(element);
		}

	}

}

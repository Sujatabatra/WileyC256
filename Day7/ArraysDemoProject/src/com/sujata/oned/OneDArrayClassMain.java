package com.sujata.oned;

import java.util.Scanner;

public class OneDArrayClassMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Total No of values : ");
		int total=scanner.nextInt();
		
		OneDArrayClass oneDArrayClass=new OneDArrayClass(total);
		
		for(int index=0;index<oneDArrayClass.getTotalElements();index++) {
			System.out.println("Enter element : ");
			oneDArrayClass.add(scanner.nextInt(), index);
		}
		
		for(int element:oneDArrayClass.getArr()) {
			System.out.println(element);
		}
		
		for(int index=0;index<oneDArrayClass.getTotalElements();index++) {
			System.out.println(oneDArrayClass.getElement(index));
		}
		

	}

}

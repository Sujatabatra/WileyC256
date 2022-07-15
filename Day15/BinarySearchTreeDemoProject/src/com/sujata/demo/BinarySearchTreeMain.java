package com.sujata.demo;

import java.util.Scanner;

public class BinarySearchTreeMain {

	public static void main(String args[]) {
		BinarySearchTreePresentation binarySearchTreePresentation=new BinarySearchTreePresentation();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			binarySearchTreePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			binarySearchTreePresentation.performMenu(choice);
		}
		
	}
}

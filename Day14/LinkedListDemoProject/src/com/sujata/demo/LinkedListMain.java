package com.sujata.demo;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		LinkedList linkedList=new LinkedList();
		int ch=1;
		while(ch!=0) {
			System.out.println("Enter element : ");
			linkedList.insertElement(scanner.nextInt());
			System.out.println("Do you want to add more elements press 0 for no and 1 for yes: ");
			ch=scanner.nextInt();
		}
		
		linkedList.displayList();

	}

}

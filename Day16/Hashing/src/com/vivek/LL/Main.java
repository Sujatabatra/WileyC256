package com.vivek.LL;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapUsingArrays hashMapUsingArrays = new HashMapUsingArrays();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 to add element 2 to delete 3 to search and 4 to display and anything else to exit");
			int ch = scanner.nextInt();
			if(ch == 1)
			{
				System.out.println("Enter element to add");
				hashMapUsingArrays.addElement(scanner.nextInt());
			}
			else if(ch == 2) {
				System.out.println("Enter element to delete");
				hashMapUsingArrays.deleteElement(scanner.nextInt());
			}
			else if (ch == 3) {
				System.out.println("Enter element to be searched");
				if(hashMapUsingArrays.searchElement(scanner.nextInt()))
					System.out.println("Element Present");
				else {
					System.out.println("Element Absent");
				}
			}
			else if(ch == 4)
				hashMapUsingArrays.display();
			else {
				System.out.println("Acha chalta hoon duaon me yaad rakhna");
				break;
			}
		}
		
	}

}

package com.sujata.demo;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter radius of Circle");
		int radius=scanner.nextInt();
		
		Circle circle=new Circle(radius);
		circle.area();
		circle.circumference();
		circle.display();

	}

}

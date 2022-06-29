package com.sujata.modular;

public class MyModularApproachFactorialDemo {

	static int number,factorial;
	
	static void input(int num) {
		number=num;
	}
	
	static void displayFactorial() {
		System.out.println("Factorial : "+factorial);
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	public static void main(String[] args) {
		input(4);
		calculateFactorial();
		factorial=-6;  //logical error
		displayFactorial();

	}

}

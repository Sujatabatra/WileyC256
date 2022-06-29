package com.sujata.oop;

// data to be readable : getter method
//data to be modifiable : setter method
public class Factorial {
	//number : modifiable (setter)
	//factorial : readable (getter)
	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
		return factorial;
	}
	

}

package com.sujata.demo;

public class MyCalculator {

	private int number1, number2, result;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getResult() {
		return result;
	}

	/*
	 * Requirement Document (R001): Division of two positive numbers
	 */
	public void divide() throws NegativeNumberException {
		if (number1 >= 0 && number2 >= 0)
			result= number1 / number2;
		else
			throw new NegativeNumberException("Negative Integers not allowed");
	}
	
	public int add()throws NegativeNumberException{
		if (number1 >= 0 && number2 >= 0)
			return number1 + number2;
		else
			throw new NegativeNumberException("Negative Integers not allowed");
	}
}

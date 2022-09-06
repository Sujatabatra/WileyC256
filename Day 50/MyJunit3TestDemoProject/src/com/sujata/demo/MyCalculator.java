package com.sujata.demo;

public class MyCalculator {

	/*
	 * Requirement Document (R001): Division of two positive numbers
	 */
	public int divide(int number1,int number2)throws NegativeNumberException {
//		if(/*number1>=0 &&*/ number2>=0)
			if(number1>=0 && number2>=0)
			return number1/number2;
		else
			throw new NegativeNumberException("Negative Integers not allowed");
	}
}

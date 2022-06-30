package com.sujata.demo;

public class ComplexNumberMain {

	public static void main(String[] args) {
	
		//Object Creation
		ComplexNumber complexNumber1=null;  //reference variable created in stack and stores null in it
		complexNumber1=new ComplexNumber();
		
		complexNumber1.setComplexNumber(4, 9);
		complexNumber1.displayComplexNumber();
		
		ComplexNumber complexNumber2=new ComplexNumber();
		complexNumber2.setComplexNumber(5, -7);
		complexNumber2.displayComplexNumber();
		
		ComplexNumber sumComplex=complexNumber1.sumComplexNumber(complexNumber2);
		sumComplex.displayComplexNumber();
		
		SumComplexNumbers sumComplexNumbers=new SumComplexNumbers();
		sumComplexNumbers.setComplexNumber1(complexNumber1);
		sumComplexNumbers.setComplexNumber2(complexNumber2);
		
		sumComplexNumbers.getSumComplexNumber().displayComplexNumber();
		
	}

}

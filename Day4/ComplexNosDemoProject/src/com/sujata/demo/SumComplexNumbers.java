package com.sujata.demo;

public class SumComplexNumbers {

	private ComplexNumber complexNumber1;
	private ComplexNumber complexNumber2;
	private ComplexNumber sumComplexNumber;
	
	public void setComplexNumber1(ComplexNumber complexNumber1) {
		this.complexNumber1 = complexNumber1;
	}
	
	public void setComplexNumber2(ComplexNumber complexNumber2) {
		this.complexNumber2 = complexNumber2;
	}
	public ComplexNumber getSumComplexNumber() {
		calculateSum();
		return sumComplexNumber;
	}
	
	private void calculateSum() {
		sumComplexNumber=new ComplexNumber();
		sumComplexNumber.setReal(complexNumber1.getReal()+complexNumber2.getReal());
		sumComplexNumber.setImaginary(complexNumber1.getImaginary()+complexNumber2.getImaginary());
	}
	
}

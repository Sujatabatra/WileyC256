package com.sujata.demo;

/*
 * Constructor is used to initialise the object at the time of declaring them
 * Rules For Constructor
 * 1. Constructor name should be same as that of your class Name
 * 2. Constructor can be argumented as well as non Argumented
 * 3. Constructor cannot have any return type not even void
 * 4. Constructor can exist in any scope i.e private, default and public
 * 5. If class is constructor challenged(don't have any constructor), 
 * then only compiler creates one no arguments constructor for that class
 * and we call zero argument constructor as default  constructor 
 * 6. A class can have multiple constructors and
 * each constructor will be differentiated from one another
 * w.r.t its signature (Signature means number and types of arguments and its sequence)
 * and this concept is known as constructor overloading
 */
public class ComplexNumber {

	private int real, imaginary;

//	public ComplexNumber() {
//		real=10;
//		imaginary=20;
//	}

	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	private ComplexNumber() {
		this.real = 8;
		this.imaginary = 4;
	}

	ComplexNumber(int real) {
		this.real = real;
	}

	public void setComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public void displayComplexNumber() {
		System.out.print(real);
		if (imaginary > 0)
			System.out.println("+" + imaginary + "i");
		else if (imaginary < 0)
			System.out.println(imaginary + "i");
	}

	public ComplexNumber sumComplexNumber(ComplexNumber c2) {
		ComplexNumber sum = new ComplexNumber();
		sum.real = this.real + c2.real;
		sum.imaginary = this.imaginary + c2.imaginary;
		return sum;
	}
}

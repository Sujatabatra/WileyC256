package com.sujata.demo;

public class ComplexNumber {

	private int real, imaginary;

	public int getReal() {
		return real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
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

}

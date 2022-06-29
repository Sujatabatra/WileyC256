package com.sujata.training;

import com.sujata.oop.Factorial;

//1!/1+2!/2+3!/3..........+n!/n
public class Series {

	private int number;
	private double sumSeries;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public double getSumSeries() {
		calculateSumSeries();
		return sumSeries;
	}
	
	public void calculateSumSeries() {
		com.sujata.oop.Factorial factorial=new com.sujata.oop.Factorial();
		
		for(int count=1;count<=number;count++) {
			factorial.setNumber(count);
			sumSeries=sumSeries+factorial.getFactorial()/count;
		}
	}
	
	
}

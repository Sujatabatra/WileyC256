package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("sum")
public class CalculateSum implements MyCalculator {

	@Override
	public int perform(int number1, int number2) {
		return number1+number2;
	}

}

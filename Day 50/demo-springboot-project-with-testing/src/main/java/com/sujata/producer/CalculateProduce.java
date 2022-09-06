package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("product")
public class CalculateProduce implements MyCalculator {

	@Override
	public int perform(int number1, int number2) {
		return number1*number2;
	}

}

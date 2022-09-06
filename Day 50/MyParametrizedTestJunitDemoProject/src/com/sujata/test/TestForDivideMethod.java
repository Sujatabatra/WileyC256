package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.sujata.demo.MyCalculator;
import com.sujata.demo.NegativeNumberException;

class TestForDivideMethod {

	private MyCalculator myCalculator;
	@BeforeEach
	void setUp() throws Exception {
		myCalculator=new MyCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		myCalculator=null;
	}

	@ParameterizedTest(name= "#{index} = {0}/{1} throws exception {2}")
	@MethodSource("valuesForTestCase")
	void testDivide(int num1,int num2,Class ex) throws NegativeNumberException {
		myCalculator.setNumber1(num1);
		myCalculator.setNumber2(num2);
		assertThrows(ex, () -> myCalculator.divide());
	}
	
	static Stream<Arguments> valuesForTestCase(){
		
		return Stream.of(Arguments.arguments(-10,5,NegativeNumberException.class),
				Arguments.arguments(10,-5,NegativeNumberException.class),
				Arguments.arguments(-10,-5,NegativeNumberException.class),
				Arguments.arguments(10,0,ArithmeticException.class));
	}
	
//	@Test
//	void R001_T002() throws NegativeNumberException {
//		myCalculator.setNumber1(-10);
//		myCalculator.setNumber2(5);
//		assertThrows(NegativeNumberException.class, () -> myCalculator.divide());
//	}
//
//	@Test
//	void R001_T004() throws NegativeNumberException {
//		myCalculator.setNumber1(-10);
//		myCalculator.setNumber2(-5);
//		assertThrows(NegativeNumberException.class, () -> myCalculator.divide());
//	}
//
//	@Test
//	void R001_T005() throws NegativeNumberException {
//		myCalculator.setNumber1(-10);
//		myCalculator.setNumber2(0);
//		assertThrows(NegativeNumberException.class, () -> myCalculator.divide());
//	}
//
//	@Test
//	void R001_T006() throws NegativeNumberException {
//		myCalculator.setNumber1(10);
//		myCalculator.setNumber2(0);
//		assertThrows(ArithmeticException.class, () -> myCalculator.divide());
//	}


}

package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.MyCalculator;
import com.sujata.demo.NegativeNumberException;

class TestMyDivide {

	private MyCalculator myCalculator;
	
	@BeforeEach
	void setUp() throws Exception {
		myCalculator=new MyCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		myCalculator=null;
	}

	@Test
	void R001_T001() throws NegativeNumberException {
//		int actualResult=myCalculator.divide(10, 5);
//		int expectedResult=2;
//		assertEquals(expectedResult,actualResult);
		assertEquals(2, myCalculator.divide(10, 5));
	}

	@Test
	void R001_T002() throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(-10, 5));
	}
	
	@Test
	void R001_T003() throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(10, -5));
	}
	
	@Test
	void R001_T004() throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(-10, -5));
	}
	
	@Test
	void R001_T005() throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(-10, 0));
	}
	
	@Test
	void R001_T006() throws NegativeNumberException{
		assertThrows(ArithmeticException.class, ()->myCalculator.divide(10, 0));
	}
	
	@Test
	void R001_T007() throws NegativeNumberException{
		assertEquals(0, myCalculator.divide(0, 10));
	}
}

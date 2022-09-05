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

		myCalculator.setNumber1(10);
		myCalculator.setNumber2(5);
		myCalculator.divide();
		assertEquals(2, myCalculator.getResult());
	}

	@Test
	void R001_T002() throws NegativeNumberException{
		myCalculator.setNumber1(-10);
		myCalculator.setNumber2(5);
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide());
	}
	
	@Test
	void R001_T003() throws NegativeNumberException{
		myCalculator.setNumber1(10);
		myCalculator.setNumber2(-5);
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide());
	}
	
	@Test
	void R001_T004() throws NegativeNumberException{
		myCalculator.setNumber1(-10);
		myCalculator.setNumber2(-5);
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide());
	}
	
	@Test
	void R001_T005() throws NegativeNumberException{
		myCalculator.setNumber1(-10);
		myCalculator.setNumber2(0);
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide());
	}
	
	@Test
	void R001_T006() throws NegativeNumberException{
		myCalculator.setNumber1(10);
		myCalculator.setNumber2(0);
		assertThrows(ArithmeticException.class, ()->myCalculator.divide());
	}
	
	@Test
	void R001_T007() throws NegativeNumberException{
		myCalculator.setNumber1(0);
		myCalculator.setNumber2(10);
		myCalculator.divide();
		assertEquals(0, myCalculator.getResult());
	}
}

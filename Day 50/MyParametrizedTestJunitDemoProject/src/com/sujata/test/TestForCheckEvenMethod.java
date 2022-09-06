package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.sujata.demo.MyCalculator;

class TestForCheckEvenMethod {

	private MyCalculator myCalculator;
	
	@BeforeEach
	void setUp() throws Exception {
		myCalculator=new MyCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		myCalculator=null;
	}

	@ParameterizedTest(name="#{index} - Test with Argument={0}")
//	@ParameterizedTest
	@ValueSource(ints = {6,143,28})
	void testCheckEven(int value) {
		assertTrue(myCalculator.checkEven(value));
	}
	
//	@Test
//	void testCheckEvenOne() {
//		assertTrue(myCalculator.checkEven(6));
//	}
//
//	@Test
//	void testCheckEvenTwo() {
//		assertTrue(myCalculator.checkEven(143));
//	}
//	
//	@Test
//	void testCheckEvenThree() {
//		assertTrue(myCalculator.checkEven(28));
//	}
}

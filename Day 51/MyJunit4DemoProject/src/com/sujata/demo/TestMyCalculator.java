package com.sujata.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



public class TestMyCalculator {

	private MyCalculator myCalculator;
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

	@Before
	public void setUp() throws Exception {
		myCalculator=new MyCalculator();
	}

	@After
	public void tearDown() throws Exception {
		myCalculator=null;
	}

	
	@Ignore
	@Test()
	public void R001_T001()throws NegativeNumberException {
		assertEquals(2, myCalculator.divide(10, 5));
		
	}
	
	
	@Test(expected = NegativeNumberException.class)
	public void R001_T002()throws NegativeNumberException {
		myCalculator.divide(-10, 5);
		
	}

	@Test
	public void R001_T007()throws NegativeNumberException {
		assertEquals(0, myCalculator.divide(0, 10));
		
	}
}

package com.sujata.demo;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestMyCalculator extends TestCase {

	private MyCalculator myCalculator;
	protected void setUp() throws Exception {
		myCalculator=new MyCalculator();
	}

	protected void tearDown() throws Exception {
		myCalculator=null;
	}

	public void testDivide1()throws NegativeNumberException {
		Assert.assertEquals(4, myCalculator.divide(20, 5));
	}
	
	public void testDivide2()throws NegativeNumberException {
		Assert.assertEquals(8, myCalculator.divide(40, 5));
	}
	
	public void testDivide3(){
		try {
			myCalculator.divide(-10, 5);
			fail("No Exception thrown");
		}
		catch(NegativeNumberException ex) {
			Assert.assertEquals("Negative Integers not allowed", ex.getMessage());
		}
	}

}

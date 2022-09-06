package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


class MyTestToCheckSequence {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass method");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown method");
	}

	@Test
	void testDivide1() {
		System.out.println("Test Case 1");
	}

//	@RepeatedTest(4)
//	@Test
	@RepeatedTest(value = 3,name = RepeatedTest.LONG_DISPLAY_NAME)
	void testDivide2() {
		System.out.println("Test Case 2");
	}
	
	@Test
	void testDivide3() {
		System.out.println("Test Case 3");
	}
	
	@Test
	void testDivide4() {
		System.out.println("Test Case 4");
	}

}

package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTestToCheckSequence {

	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
	static void globalEnviornmentSetup() throws Exception {
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
	
	@Test
	void testDivide2() {
		System.out.println("Test Case 2");
	}
	

}

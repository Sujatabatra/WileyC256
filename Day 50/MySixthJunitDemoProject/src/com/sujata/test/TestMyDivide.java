package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import com.sujata.demo.MyCalculator;
import com.sujata.demo.NegativeNumberException;

class TestMyDivide {

	private MyCalculator myCalculator;

	@BeforeEach
	void setUp() throws Exception {
		myCalculator = new MyCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		myCalculator = null;
	}

	@Test
	void R001_T003() throws NegativeNumberException {
		myCalculator.setNumber1(10);
		myCalculator.setNumber2(-5);
		assertThrows(NegativeNumberException.class, () -> myCalculator.divide());
	}

	@Test
	void R001_T001() throws NegativeNumberException {

		myCalculator.setNumber1(10);
		myCalculator.setNumber2(5);
		myCalculator.divide();
		assertEquals(2, myCalculator.getResult());
	}

	@Test
	void R001_T002() throws NegativeNumberException {
		myCalculator.setNumber1(-10);
		myCalculator.setNumber2(5);
		assertThrows(NegativeNumberException.class, () -> myCalculator.divide());
	}

	@Test
	void R001_T004() throws NegativeNumberException {
		myCalculator.setNumber1(-10);
		myCalculator.setNumber2(-5);
		assertThrows(NegativeNumberException.class, () -> myCalculator.divide());
	}

	@Test
	void R001_T005() throws NegativeNumberException {
		myCalculator.setNumber1(-10);
		myCalculator.setNumber2(0);
		assertThrows(NegativeNumberException.class, () -> myCalculator.divide());
	}

	@Test
	void R001_T006() throws NegativeNumberException {
		myCalculator.setNumber1(10);
		myCalculator.setNumber2(0);
		assertThrows(ArithmeticException.class, () -> myCalculator.divide());
	}

	@Test
	void R001_T007() throws NegativeNumberException {
		myCalculator.setNumber1(0);
		myCalculator.setNumber2(10);
		myCalculator.divide();
		assertEquals(0, myCalculator.getResult());
	}

	@Test
	void R002_T001() throws NegativeNumberException {
		myCalculator.setNumber1(10);
		myCalculator.setNumber2(20);
		assertEquals(30, myCalculator.add());
	}

	@Test
	void R002_T002() throws NegativeNumberException {
		myCalculator.setNumber1(-10);
		myCalculator.setNumber2(20);
		assertThrows(NegativeNumberException.class, () -> myCalculator.add());
	}

	@Test
	void R002_T003() throws NegativeNumberException {
		myCalculator.setNumber1(10);
		myCalculator.setNumber2(-20);
		assertThrows(NegativeNumberException.class, () -> myCalculator.add());
	}

	@EnabledOnOs(value = OS.LINUX)
	@Test
	void R002_T004() throws NegativeNumberException {
		myCalculator.setNumber1(-10);
		myCalculator.setNumber2(-20);
		assertThrows(NegativeNumberException.class, () -> myCalculator.add());
	}

	@DisabledOnJre(value = JRE.JAVA_11)
	@Test
	void R002_T005() throws NegativeNumberException {
		myCalculator.setNumber1(10);
		myCalculator.setNumber2(0);
		assertEquals(10, myCalculator.add());
	}

	@DisabledOnOs(value = {OS.WINDOWS,OS.LINUX})
	@Test
	void R002_T006() throws NegativeNumberException {
		myCalculator.setNumber1(0);
		myCalculator.setNumber2(20);
		assertEquals(20, myCalculator.add());
	}

//	@Disabled("This Module is under development")
	@Nested
	class CheckProduct {

		@Disabled
		@Test
		void R003_T001() throws NegativeNumberException {
			myCalculator.setNumber1(5);
			myCalculator.setNumber2(10);
			assertEquals(50, myCalculator.product());
		}

		@Disabled
		@Test
		void R003_T002() throws NegativeNumberException {
			myCalculator.setNumber1(-5);
			myCalculator.setNumber2(10);
			assertThrows(NegativeNumberException.class, () -> myCalculator.product());
		}
		
		@Test
		void R003_T003() throws NegativeNumberException {
			myCalculator.setNumber1(5);
			myCalculator.setNumber2(-10);
			assertThrows(NegativeNumberException.class, () -> myCalculator.product());
		}

		@Disabled
		@Test
		void R003_T004() throws NegativeNumberException {
			myCalculator.setNumber1(-5);
			myCalculator.setNumber2(-10);
			assertThrows(NegativeNumberException.class, () -> myCalculator.product());
		}

		@Test
		void R003_T005() throws NegativeNumberException {
			myCalculator.setNumber1(5);
			myCalculator.setNumber2(0);
			assertEquals(0, myCalculator.product());
		}

	}
}

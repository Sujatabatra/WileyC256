package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.sujata.demo.MyCalculator;
import com.sujata.demo.NegativeNumberException;

@DisplayName("Testing MyCalculator Class")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
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

	@Nested
	class CheckDivideMethod {
		@DisplayName("Dividing 10 by 5")
		@Test
		void R001_T001() throws NegativeNumberException {

			myCalculator.setNumber1(10);
			myCalculator.setNumber2(5);
			myCalculator.divide();
			assertEquals(2, myCalculator.getResult());
		}

		@DisplayName("Dividing -10 by 5")
		@Test
		void R001_T002() throws NegativeNumberException {
			myCalculator.setNumber1(-10);
			myCalculator.setNumber2(5);
			assertThrows(NegativeNumberException.class, () -> myCalculator.divide());
		}

		@Test
		void R001_T003() throws NegativeNumberException {
			myCalculator.setNumber1(10);
			myCalculator.setNumber2(-5);
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

//	@DisplayName("R001 T006")
		@Test
		void dividing_10_by_0() throws NegativeNumberException {
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
	}

	@Nested
	class CheckAddMethod {
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

		@Test
		void R002_T004() throws NegativeNumberException {
			myCalculator.setNumber1(-10);
			myCalculator.setNumber2(-20);
			assertThrows(NegativeNumberException.class, () -> myCalculator.add());
		}

		@Test
		void R002_T005() throws NegativeNumberException {
			myCalculator.setNumber1(10);
			myCalculator.setNumber2(0);
			assertEquals(10, myCalculator.add());
		}

		@Test
		void R002_T006() throws NegativeNumberException {
			myCalculator.setNumber1(0);
			myCalculator.setNumber2(20);
			assertEquals(20, myCalculator.add());
		}
	}
}

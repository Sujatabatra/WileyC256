package com.sujata.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.sujata.producer.MyCalculator;

@SpringBootTest
class DemoSpringbootProjectWithTestingApplicationTests {

	@Autowired
	@Qualifier("sum")
	private MyCalculator myCalculator;
	
	@Test
	void testCaseOne() {
		assertEquals(30, myCalculator.perform(10, 20));
	}

}

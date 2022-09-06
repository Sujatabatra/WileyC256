package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class DemoSpringbootProjectWithTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootProjectWithTestingApplication.class, args);
	}

}

package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class SpringbootWebMcvEmployeeLayeredDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebMcvEmployeeLayeredDemoApplication.class, args);
	}

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}

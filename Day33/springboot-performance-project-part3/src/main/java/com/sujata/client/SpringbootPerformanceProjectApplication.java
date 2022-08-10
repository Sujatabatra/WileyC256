package com.sujata.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.producer.Performer;
import com.sujata.producer.Singer;

//@SpringBootApplication = @Configuration + @ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata")
public class SpringbootPerformanceProjectApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("Aishwarya")
	private Performer performer1;
	
	
	@Autowired
	@Qualifier("Vipul")
	private Performer performer2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootPerformanceProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		performer1.perform();
		
		performer2.perform();
	}

	
}

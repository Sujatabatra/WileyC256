package com.sujata.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.producer.Performer;
import com.sujata.producer.Singer;

//@SpringBootApplication = @Configuration + @ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata")
public class SpringbootPerformanceProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(SpringbootPerformanceProjectApplication.class, args);
		
		Performer performer1=(Performer)applicationContext.getBean("Vipul");
		performer1.perform();
		
		
		Performer performer2=(Performer)applicationContext.getBean("Aishwarya");
		performer2.perform();
		
		Performer performer3=(Performer)applicationContext.getBean("Vishwajeet");
		performer3.perform();
	}

	@Bean("Vishwajeet")
	public Singer getSinger() {
		Singer singer1=new Singer();
		singer1.setSong("Pasoori");
		return singer1;
	}
}

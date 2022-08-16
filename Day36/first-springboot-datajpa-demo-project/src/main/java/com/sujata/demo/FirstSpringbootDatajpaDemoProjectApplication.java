package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.presentation.CustomerPresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class FirstSpringbootDatajpaDemoProjectApplication implements CommandLineRunner {

	@Autowired
	private CustomerPresentation customerPresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootDatajpaDemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			customerPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			customerPresentation.performMenu(choice);
			
		}
		
	}

}

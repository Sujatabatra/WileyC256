package com.sujata.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Customer;
import com.sujata.persistence.CustomerDao;
import com.sujata.presentation.CustomerPresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class SecondSpringbootDatajpaDemoProjectApplication implements CommandLineRunner {

//	@Autowired
//	private CustomerPresentation customerPresentation;
	@Autowired
	private CustomerDao customerDao;
	public static void main(String[] args) {
		SpringApplication.run(SecondSpringbootDatajpaDemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
//		while(true) {
//			customerPresentation.showMenu();
//			System.out.println("Enter Choice : ");
//			int choice=scanner.nextInt();
//			customerPresentation.performMenu(choice);
//			
//		}
		
		System.out.println("Enter Name : ");
		String na=scanner.next();
		
		List<Customer> customers=customerDao.findByCustomerName(na);
		System.out.println(customers);
		
		
	}
}

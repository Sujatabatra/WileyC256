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
//		
		System.out.println("Enter Address : ");
		String add=scanner.next();
		
		List<Customer> customers=customerDao.getCustomerByAddress(add);
		System.out.println(customers);
		
		
		System.out.println("Enter Name : ");
		String na=scanner.next();
		System.out.println("Enter Email : ");
		String email=scanner.next();
		
		List<String> customerNames=customerDao.getNamesByNameAndMail(na, email);
		System.out.println(customerNames);
		
		
		System.out.println("Enter customer ID whose wallet balance you want to update : ");
		int cId=scanner.nextInt();
		System.out.println("Enter new wallet Balance : ");
		double bal=scanner.nextDouble();
		
		if(customerDao.updateBalance(bal, cId)>0)
			System.out.println("Updated!");
		else
			System.out.println("Not Updated!");
		
		System.out.println(customerDao.findById(cId).get());
	}
}

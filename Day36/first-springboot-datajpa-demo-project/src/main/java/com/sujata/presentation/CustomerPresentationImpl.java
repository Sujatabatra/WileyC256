package com.sujata.presentation;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Customer;
import com.sujata.service.CustomerService;

@Component
public class CustomerPresentationImpl implements CustomerPresentation {

	@Autowired
	private CustomerService customerService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Add Customer ");
		System.out.println("2. List All Customers");
		System.out.println("3. Search Customer ");
		System.out.println("4. Delete Customer");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		Customer customer;
		int customerId=0;
		switch (choice) {
		case 1:
			customer=new Customer();
			System.out.println("Enter Customer id :");
			customer.setCustomerId(scanner.nextInt());
			System.out.println("Enter Customer Name : ");
			customer.setCustomerName(scanner.next());
			System.out.println("Enter Customer E-Mail Id : ");
			customer.setCustomerMailId(scanner.next());
			System.out.println("Enter Customer Address : ");
			customer.setCustomerAddress(scanner.next());
			System.out.println("Enter Customer wallet Balance : ");
			customer.setCustomerWalletBalance(scanner.nextDouble());
			
			if(customerService.addCustomer(customer))
				System.out.println("Customer added Successfully!");
			else
				System.out.println("Customer addition failed!");
			break;

		case 2:
			List<Customer> customers=customerService.getCustomers();
			for(Customer cust:customers) {
				System.out.println(cust);
			}
			break;
		case 3:
			System.out.println("Enter Customer ID : ");
			customerId=scanner.nextInt();
			Optional<Customer> searchedCustomer=customerService.getCustomerById(customerId);
			if(searchedCustomer.isPresent())
				System.out.println(searchedCustomer.get());
			else
				System.out.println("Customer with "+customerId+" does not exist");
			break;
		case 4:
			System.out.println("Enter Customer ID : ");
			customerId=scanner.nextInt();
			if(customerService.deleteCustomer(customerId))
				System.out.println("Customer deleted Successfully!");
			else
				System.out.println("Customer deletion failed!");
			break;
		case 5:
			System.out.println("Thanks for using our system");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}

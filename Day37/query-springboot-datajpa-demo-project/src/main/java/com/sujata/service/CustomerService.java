package com.sujata.service;

import java.util.List;
import java.util.Optional;

import com.sujata.bean.Customer;

public interface CustomerService {

	List<Customer> getCustomers();
	Optional<Customer> getCustomerById(int cId);
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(int Id);
}

package com.sujata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sujata.bean.Customer;
import com.sujata.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> getCustomers() {
		
		return customerDao.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(int cId) {
		return customerDao.findById(cId);
	}

	@Override
	public boolean addCustomer(Customer customer) {
		customerDao.save(customer);
		return true;
	}

	@Override
	public boolean deleteCustomer(int Id) {
		try {
		customerDao.deleteById(Id);
		}
		catch (EmptyResultDataAccessException e) {
			return false;
		}
		return true;
	}

}

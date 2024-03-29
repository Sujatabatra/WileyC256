package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}

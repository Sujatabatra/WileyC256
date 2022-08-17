package com.sujata.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.sujata.bean.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	List<Customer> findByCustomerName(String name);
	
	List<Customer> findByCustomerWalletBalanceLessThan(int balance);
	
	@Query(value = "from Customer where customerAddress=:addr")
	List<Customer> getCustomerByAddress(@Param("addr") String address);
	
	@Query(value = "select customerName from Customer where customerName=:na and customerMailId=:email ")
	List<String> getNamesByNameAndMail(@Param("na") String name,@Param("email") String mail);
	
	
	@Modifying
	@Transactional
	@Query(value = "Update Customer set customerWalletBalance=:bal where customerId=:id")
	int updateBalance(@Param("bal") double balance,@Param("id") int cId);
	
//	@Modifying
//	@Transactional
//	@Query(value = "insert into CustomerJPA(cId,address,email,cName,walletBalance) values(?,?,?,?,?)",nativeQuery = true)
//	int insertCustomer(@Param("id") int id,@Param("name") String name,@Param("add") String addr,@Param("mail") String email,@Param("bal") double balance);
}

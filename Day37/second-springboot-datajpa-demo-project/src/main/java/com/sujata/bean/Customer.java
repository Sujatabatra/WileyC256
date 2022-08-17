package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "CustomerJPA")
public class Customer {

	@Id
	@Column(name = "cId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@Column(name = "cName")
	private String customerName;
	
	@Column(name="email")
	private String customerMailId;
	
	@Column(name="address")
	private String customerAddress;
	
	@Column(name="walletBalance")
	private double customerWalletBalance;

	public Customer(String customerName, String customerMailId, String customerAddress, double customerWalletBalance) {
		super();
		this.customerName = customerName;
		this.customerMailId = customerMailId;
		this.customerAddress = customerAddress;
		this.customerWalletBalance = customerWalletBalance;
	}
	
	
}

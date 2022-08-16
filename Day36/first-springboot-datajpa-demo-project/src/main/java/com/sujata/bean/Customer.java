package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {

	@Id
	private int customerId;
	private String customerName;
	private String customerMailId;
	private String customerAddress;
	private double customerWalletBalance;
	
}

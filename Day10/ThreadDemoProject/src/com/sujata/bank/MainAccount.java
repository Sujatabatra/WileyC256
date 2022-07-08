package com.sujata.bank;

public class MainAccount {

	public static void main(String[] args) {
		Account a001=new Account();
//		Account a002=new Account();
		Thread bhuwnesh=new Thread(a001, "Bhuwnesh");
		Thread jai=new Thread(a001, "Jai");
		
		bhuwnesh.start();
		jai.start();

	}

}

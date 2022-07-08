package com.sujata.bank;

public class Account implements Runnable {

	public static int balance = 1000;

	@Override
	public void run() {
		//class level locking
//		synchronized (Account.class) {
		//object level locking
		synchronized (this) {
			if (balance > 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw, your current balance is Rs." + balance);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance -= 800;
				System.out.println(Thread.currentThread().getName() + " your balance after withdrawl is Rs." + balance);
			} else
				System.out.println(Thread.currentThread().getName()
						+ " you have insufficient balance to withdraw, your current balance is Rs." + balance);
		}
	}

}

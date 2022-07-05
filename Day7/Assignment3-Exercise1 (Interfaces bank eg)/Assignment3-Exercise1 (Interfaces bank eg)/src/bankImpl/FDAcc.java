package bankImpl;

import bank.CreditInterest;
import bank.DepositAcc;

public class FDAcc implements CreditInterest, DepositAcc {

	private long accNo;
	private String accHoldersName;
	private double availableBalance;
	
	public FDAcc(long accNo, String accHoldersName, double availableBalance) {
		this.accNo = accNo;
		this.accHoldersName = accHoldersName;
		this.availableBalance = availableBalance;
		createAcc();
	}

	@Override
	public void createAcc() {
		System.out.println(fixed+"Account created !");

	}

	@Override
	public double calcInt() {
		return availableBalance*fixedInterest/100;

	}

	@Override
	public void addMonthlyInt() {
		availableBalance+=calcInt()/12;
		System.out.println("Monthly Interest added: "+calcInt()/12+" Rs.");

	}

	@Override
	public void addHalfYrlyInt() {
		availableBalance+=calcInt()/2;
		System.out.println("Half Yearly Interest added: "+calcInt()/2);

	}

	@Override
	public void addAnnualInt() {
		availableBalance+=calcInt();
		System.out.println("Annual Interest added: "+calcInt());

	}

	@Override
	public void withdraw(double amount) {
		if(amount>availableBalance) {
			availableBalance=availableBalance-amount;
			System.out.println("Account debited with "+amount+" Rs.");
		}
		else {
			System.out.println("Insufficient funds!");
		}

	}

	@Override
	public void deposit(double amount) {
		availableBalance+=amount;
		System.out.println("Account credited with "+amount+" Rs.");

	}

	@Override
	public double getBalance() {
		return availableBalance;
	}
	
	public void displayAccInfo() {
		System.out.println(fixed+" account");
		System.out.println("Account number: "+accNo);
		System.out.println("Account holder's name: "+accHoldersName);
		System.out.println("Available balance in account: "+availableBalance);
	}

}

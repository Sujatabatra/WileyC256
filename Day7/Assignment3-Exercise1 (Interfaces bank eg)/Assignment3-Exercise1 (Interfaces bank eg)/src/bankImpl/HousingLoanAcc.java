package bankImpl;

import bank.DebitInterest;
import bank.LoanAcc;

public class HousingLoanAcc implements LoanAcc, DebitInterest {
	
	private long loanAccNo;
	private String accHolderName;
	private double principalAmount;
	private double loanInterest;

	public HousingLoanAcc(long loanAccNo, String accHolderName, double principalAmount) {
		this.loanAccNo = loanAccNo;
		this.accHolderName = accHolderName;
		this.principalAmount = principalAmount;
		createAcc();
	}

	@Override
	public void createAcc() {
		System.out.println(housingLoan+" account created.");
		
	}

	@Override
	public double calcInt() {
		return principalAmount*housingLoanInterest/100;
		
	}

	@Override
	public void deductMonthlyInt() {
		//loanInterest+=calcInt()/12;
		System.out.println("Monthly interest deducted: "+calcInt()/12);
		
	}

	@Override
	public void deductHalfYrlyInt() {
		//loanInterest+=calcInt()/2;
		System.out.println("Half yearly interest deducted: "+calcInt()/2);
		
	}

	@Override
	public void deductAnnualInt() {
		loanInterest+=calcInt();
		System.out.println("Annual interest deducted: "+calcInt());
	}

	@Override
	public void repayPrincipal() {
		principalAmount=0;
		System.out.println("Principal repayed");
		
	}

	@Override
	public void payInterest(double amount) {
		loanInterest-=amount;
		System.out.println("Loan Interest paid: "+amount);
		
	}

	@Override
	public void payPartialPrincipal(double amount) {
		principalAmount-=amount;
		System.out.println("Partial principal amount paid: "+amount);
		
	}

	public void displayAccInfo() {
		System.out.println(housingLoan+" account");
		System.out.println("Account number: "+loanAccNo);
		System.out.println("Account holder's name: "+accHolderName);
		System.out.println("Principal amount: "+principalAmount);
		System.out.println("Interest amount: "+calcInt());
	}

}

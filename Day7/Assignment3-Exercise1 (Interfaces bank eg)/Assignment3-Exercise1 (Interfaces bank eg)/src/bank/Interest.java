package bank;

public interface Interest {
	double savingsInterest=3.5;
	double fixedInterest=4.75;
	double personalLoanInterest=16;
	double housingLoanInterest=12;
	
	public double calcInt();
}

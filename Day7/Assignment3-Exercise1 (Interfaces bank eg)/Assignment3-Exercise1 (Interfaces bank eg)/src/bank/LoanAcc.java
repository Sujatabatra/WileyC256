package bank;

public interface LoanAcc extends Account {
	public void repayPrincipal();
	public void payInterest(double amount);
	public void payPartialPrincipal(double amount);
}

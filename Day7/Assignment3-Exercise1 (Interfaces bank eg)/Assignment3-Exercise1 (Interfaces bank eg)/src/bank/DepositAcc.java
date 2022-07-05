package bank;

public interface DepositAcc extends Account {
	public void withdraw(double amount);
	public void deposit(double amount);
	public double getBalance();
}

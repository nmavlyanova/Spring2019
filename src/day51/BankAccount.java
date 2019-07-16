package day51;

public class BankAccount {

	String accountName;
	long accountNumber;
	double balance;
	public BankAccount(String accountName, long accountNumber, double balance) {
		
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" 
				+ accountNumber + ", balance=" + balance
				+ "]";
	}
	
	
	public void deposit(int dep) {
		this.balance+=dep;
	}
	public void withdraw(int withdr) {
		this.balance-=withdr;
	}
	
	
	
	
	
}

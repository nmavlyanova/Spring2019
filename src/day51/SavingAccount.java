package day51;

public class SavingAccount extends BankAccount {

	double returnRate;
	
	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate  ) {
		super(accountName, accountNumber, balance);
		this.returnRate=returnRate;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" 
				+ accountNumber + ", balance=" + balance+", returnRate="
				+ returnRate+ "]";
	}
	
	@Override
	public void deposit(int dep) {
		//this.balance+=dep+100;
		super.deposit(dep+100);
	}
	
	@Override
	public void withdraw(int withdr) {
		this.balance-=withdr+10;
	}
	
	
	
}

package day40;

public class BankAccount {
	
	//2 instance variable/field
	String accountHolder;
	double balance;
	
	
	//create an instance method(non-static method)
	//called showAccountHolder --> print out Account Holder name
	
	//create an instance method showBalance
	
	//create an instance method called add100Dollar does not accept any parameters
	//and return no value
	//increase the balance of the account by 100;
	
	//Create another class called BankActivity with main method 
	//create bank account object
	//set account holder name and balance value
	//call your showAccountHolder and showBalance method
	
	//call your showBalance method again to see whether balance has changed

	public void showAccountHolder(){
		System.out.println("Account holder name :  "+accountHolder);
	}
	public void showBalance() {
		System.out.println("Balance on the aacount is :  "+balance);
	}
	//adding 100 to balance current value
	public void add100Dollar() {
		balance+=100;
	}
	//adding <custom amount> dollar to current balance
	public void addDollar(int amount) {
		balance+=amount;
	}
	
	
	
}

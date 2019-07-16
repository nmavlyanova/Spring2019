package day51;

public class AtTheTeller {

	
	public static void main(String[] args) {
		
	SavingAccount saving = new SavingAccount("Nodira", 123456789l, 11000, 2.3);
	System.out.println(saving);
	
	saving.deposit(2500);
	System.out.println("Current amount is: "+saving.balance);
	
	saving.withdraw(1000);
	System.out.println("Current amount is: "+ saving.balance);
	
		
		
		
	}
}

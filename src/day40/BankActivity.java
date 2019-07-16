package day40;

public class BankActivity {

public static void main(String[]args) {
		
		BankAccount customer1 = new BankAccount();
		customer1.accountHolder= "Nodira";
		customer1.balance=1500;
		
		customer1.showAccountHolder();
		customer1.showBalance();
		customer1.add100Dollar();
		customer1.showBalance();
		//int amount=scan.nextInt();
		customer1.addDollar(50000);
		customer1.showBalance();
		
		
		
		BankAccount customer2= new BankAccount();
		customer2.accountHolder = "Farrukh Mavlyanov";
		customer2.balance = 120000;
		
		customer2.showAccountHolder();
		customer2.showBalance();
		customer2.add100Dollar();
		customer2.showBalance();
		
	}
	
	}



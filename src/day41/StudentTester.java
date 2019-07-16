package day41;
import day40.BankAccount;
public class StudentTester {

	
	public static void main(String[] args) {
		
		
		Student muammar = new Student();
		muammar.name = "Muammar";
		muammar.age = 27;
		muammar.ssn = 1234567;
		
		muammar.displayName();
		
		//BankAccount is in different package
		BankAccount acc1 = new BankAccount();
		
		
		//System.out.println(acc1.balance);
		
		
		
		
	}
}

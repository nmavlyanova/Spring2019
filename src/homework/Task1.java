package homework;
import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

	double usersPrice;
	String ifPrimeMember;
	
	System.out.println("Welcome Amazon shopper.");
	System.out.println("Are you a Prime Member?");
	ifPrimeMember = input.next();
	
	System.out.println("Please enter your price:");
	usersPrice = input.nextDouble();
	
	if (ifPrimeMember.equals("yes")) {
		System.out.println("You got free shipping " + usersPrice);
	}else if (ifPrimeMember.equals("no")&&usersPrice>=35) {
		System.out.println("You got free shipping "+ usersPrice);
		
	}else if(ifPrimeMember.contentEquals("no")&&usersPrice<35) {
		System.out.println("Your total is:" + (usersPrice+5));
	}
	
	}

}

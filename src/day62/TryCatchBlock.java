package day62;

import java.util.Scanner;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Begginning of the code ");
		Scanner scan = new Scanner(System.in);
		
		// Try catch block is used to wrap up a piece of code that anticipated to throw certain type of
		// and catch the exception that happen if it happen
		// and either try to recover from it or just report it
		// so the program does not shutdown and continiue to execute
		
	try {
		
		System.out.println("Enter num1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter num2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Division result is "+ num1/num2);
		
	// we are specifically trying catch ArithmeticException if it happen
	}catch (ArithmeticException e) {
		
		System.out.println(" You INPUT 0 for second number");
	}
	System.out.println("Ending of the code");
}
}
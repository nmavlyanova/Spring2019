package classwork;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * add two numbers
		 * subtract two numbers
		 * multiply
		 * divide
		 * mod 
		 * 
		 * 
		 * OPTIONAL
		 * calculate method that take 3 parameters
		 * 
		 */

		addition(10,5);
		subtraction(16,2);
		multiplication(5,3);
		division(20,10);
		module(21,5);
	}
	
	
	public static void addition(int num1, int num2) {
		System.out.println("Result of addition is: "+(num1+num2));
	}
	public static void subtraction(int num1, int num2) {
		System.out.println("Result of subtraction is: "+(num1-num2));
}
	public static void multiplication(int num1, int num2) {
		System.out.println("Result of multiplication is: "+(num1*num2));
	}
	public static void division(int num1, int num2) {
		System.out.println("Result of division is: "+(num1/num2));
	}
	public static void module(int num1, int num2) {
		System.out.println("Reminder of division is: "+(num1%num2));
	}
	
}

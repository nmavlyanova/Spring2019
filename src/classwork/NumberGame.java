package classwork;

import java.util.Scanner;

public class NumberGame {

	public static void printTheDoubledNumber() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();
		number *=2;
		System.out.println(number);
	}
	
	public static void  checkForAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		if(age>18) {
			System.out.println("adult");
		}else {
			System.out.println("not an adult");
		}
	}
	public static void main(String[] args) {
		printTheDoubledNumber();
		checkForAge();
		

	}

}

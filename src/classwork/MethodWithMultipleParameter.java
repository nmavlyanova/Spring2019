package classwork;

import java.util.Scanner;

public class MethodWithMultipleParameter {
	
	public static void repeat(String word, int num) {
		for (int i = 1; i <=num; i++) {
			System.out.print(word + " ");
		}System.out.println();
	}

	public static void main(String[] args) {
		
		repeat("java", 5);
		repeat("spartan", 10);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Input word to repeat");
		String str = scan.nextLine();
		System.out.println("Input a number to repeat");
		int num = scan.nextInt();
		
		repeat(str,num);
		

	}

}

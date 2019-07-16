//Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
//You may assume that n is between 0 and the length of the string, inclusive.


package replit;

import java.util.Scanner;

public class Task101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		int length = str.length();
		for (int i = 0; i <n ; i++) {
		
		
			
			System.out.print(str.substring(length-n));
			
		}

	}

}

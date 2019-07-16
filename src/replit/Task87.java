//Return the number of times that the string "java" appears anywhere in the given string word.
//
//Example:
//input: javaxjava
//output: 2
//
//Example:
//input: javaxjavaapplepearjavaegg
//output: 3



package replit;

import java.util.Scanner;

public class Task87 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String word = scan.next();
		int count = 0;
		int length = word.length()-1;
		for (int i = 0; i<=length; i++ ){
			if (word.charAt(i)=='j'&&word.charAt(i+1)=='a'&& word.charAt(i+2)=='v'&&word.charAt(i+3)=='a') {
				count++;
			}
		}System.out.println(count);
		
		

	}

}

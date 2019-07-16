//Write a program that will print out letters in the alphabetic order accordingly to the given range. 
//Example:
//input: A
//input: Z
//output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
//
//Example:
//input: a
//input: f
//output: abcdef
//
//Example:
//input: a
//input: d
//output: abcd
//
//Example:
//input: B
//input: O
//output: BCDEFGHIJKLMNO
//
//
//
package replit;

import java.util.Scanner;

public class Task97 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
		    	while(start<=end) {
		    		System.out.print(start);
		    		start++;
		    	}

	}

}

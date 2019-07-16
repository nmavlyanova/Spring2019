//Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 
//Example:
//input: javapython
//output: true
//
//Example:
//input: cjavac++
//output: true
//
//
//Example:
//input: c#javaruby
//output: false

package replit;

import java.util.Scanner;

public class Task89 {

	public static void main(String[] args) {
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int length =word.length()-1;
//	    for (int i = 0; i<2; i++) {
////	    	if ((word.indexOf("java").equals(word.substring(0,4)))||(word.indexOf("java")==word.charAt(1))) {
//	    		System.out.println("true");
//	    	}else {
//	    		System.out.println("false");
//	    	}
	    }

	
}

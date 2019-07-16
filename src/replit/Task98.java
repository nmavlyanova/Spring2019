//Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
//Example:
//input: We study java not python
//output: true
//
//Example:
//input: What's the difference between java, javascript and python?
//output: false

package replit;

import java.util.Scanner;

public class Task98 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int length = sentence.length();
	    int countJava = 0;
	    int countPython = 0;
	    for (int i = 0; i < length-3; i++) {
	    	if (sentence.substring(i,i+4).equals("java")) {
	    		countJava++;
	    	}}
	    for (int b = 0; b < length-5; b++) {
	    	 if(sentence.substring(b,b+6).equals("python")) {
	    		countPython++;
	    		
	    	}
	    	 
			
		}if (countJava==countPython) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	    
	
	    
	    
	}
	    }

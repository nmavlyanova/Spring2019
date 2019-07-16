package classwork;

import java.util.Scanner;

public class Asses5_1 {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    for (int i = 0; i < word.length(); i++) {
	    	if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='i'||word.charAt(i)=='u') {
	    		System.out.print(word.charAt(i));
	    	}
			
		}
	    
	  }
}

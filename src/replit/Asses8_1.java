package replit;

import java.util.Scanner;

//For you to do:
//
//Given a string variable "word", do the following tests
//
//If the word ends in "y", print "-ies"
//If the word ends in "ey", print "-eys"
//If the word ends in "ife", print "-ives"
//If none of the above is true, print "-s"
//No more than one should be printed.

public class Asses8_1 {

	public static void main(String[] args) {
	  	Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String word = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	
	  	if((word.substring(word.length()-2)).equals("ey")) {
	    	System.out.println("eys");
	    }else if ((word.substring(word.length()-1)).equals("y")) {
	    	System.out.println("ies");
	    }else if((word.substring(word.length()-3)).equals("ife")) {
	    	System.out.println("ives");
	    }else 
	    	System.out.println("s");
	    }
	    
	  	
	  	
	  	
	  	
	  
	
}

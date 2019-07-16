//Given a String variable sentence, write code to type each word in separate lines.
//
//Example:
//sentence -> "Java is fun"
//Print
//Java
//is
//fun





package replit;

import java.util.Scanner;

public class Task116 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    int s = 0;
		    String replace= "";
		    for (int i = 0; i < sentence.length(); i++) {
		    	
		    	replace = sentence.replace(" " ,"\n");
		    	
				
			}System.out.println(replace);
		    
	}

}

//Given a String array words, iterate through each word and print first and last letter of each element in the format below.
//
//Example:
//
//words → ["hello", "why", "by", "apple" , "note"]
//print → [ho, wy, by, ae, ne] 





package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Task113 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    String firstLastChar = "";
	    for (int i = 0; i < words.length; i++) {
		firstLastChar = words[i].substring(0,1)+words[i].substring(words[i].length()-1,words[i].length());
		words[i]=firstLastChar;
		
	}
	    System.out.print(Arrays.toString(words));
	}

}

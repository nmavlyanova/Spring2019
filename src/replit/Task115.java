//Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
//
//Example:
//words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//prints jaaaaavvaaaaaaaaaa





package replit;

import java.util.Scanner;

public class Task115 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine(); 
		} 
		  String  maxLength = new String();
		  for (int j = 0; j < words.length; j++) {
			  if(words[j].length()>=maxLength.length()) {
				  maxLength=words[j];
			  
			  
			
		}
		  
		  
		}System.out.println(maxLength);
		
		
		
		
		

	}

}

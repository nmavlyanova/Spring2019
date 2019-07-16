package classwork;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassMethods {

	public static void main(String[] args) {
		
		
		String[] word = {"coding", "start", "to", "Day", "Perfect", "Sunday"};
		
		Arrays.sort(word);
		System.out.println(Arrays.toString(word));
		
		
		String[] first2words = Arrays.copyOf(word, 2);
		System.out.println(Arrays.toString(first2words));
		
		String[] tenItem = Arrays.copyOf(word,10) ;
	     System.out.println( Arrays.toString(tenItem) );
	     
	     // create a program to add items to an array by users input 
	     // {1,23,4,5,6}  , 17  ---> {1,23,4,5,6, 17}  
	     Scanner scan = new Scanner(System.in); 
	     System.out.println("Enter your word to be added ");
	     String usersWord = scan.next() ; 
	     
	     String[] newWords = Arrays.copyOf(word, word.length + 1) ; 
	     System.out.println( Arrays.toString(newWords) );
	     
	     int lastSpotIndex = newWords.length-1 ; 
	     newWords[lastSpotIndex] = usersWord ; 
	     System.out.println( Arrays.toString(newWords) );
	       
	     
	     
	     
	     
	    
	    
	    


	}

}

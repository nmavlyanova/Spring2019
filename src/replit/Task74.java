package replit;
import java.util.Scanner;
public class Task74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    
		   char firstLetter = word.charAt(0);
		   char lastLetter = word.charAt(word.length()-1);
		    
		    
		    if (((word.charAt(0) == 'X')||(firstLetter=='x'))&&
		    ((lastLetter=='X')||(lastLetter=='x'))){
		    	System.out.println(word.replace("X",""));
		    }
	}

}

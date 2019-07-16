//Given a String variable email, write code using split method to print email id and domain in separate lines.
//
//Example:
//email -> info@cybertekschool.com
//Print:  
//Email id: info
//Email domain: cybertekschool.com
//
//
//If email contains no @ character or multiple @ characters then print invalid email:
//
//email -> hello-gmail.com
//print:  
//invalid email
//
//email -> my@fancy@email.com
//print:  
//invalid email



package replit;

import java.util.Scanner;

public class Task118 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    int count = 0;
	    
	    for (int  i= 0;  i< email.length(); i++) {
			if(email.substring(i,i+1).equals("@")) {
				count++;		
			}
			}if ((count>1||count<1)) {
	    	System.out.println("invalid email");}
			
			else if (count==1) {
	    	String[] emailSplit = email.split("@");
			System.out.println("Email id: " +emailSplit[0]+"\nEmail domain: "+emailSplit[1]);
			}
	    }
}
	    
	    
	



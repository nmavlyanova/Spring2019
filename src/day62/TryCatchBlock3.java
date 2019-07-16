package day62;

import java.util.Scanner;

public class TryCatchBlock3 {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code ");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter String with at least one character : ");
		
		String str = scan.nextLine();
		int targetIndex = scan.nextInt();
		
	try {
		
		System.out.println("Try catch block begin");
		//  access 2nd character
		System.out.println("Your second character is : "+ str.charAt(targetIndex));
		System.out.println("Try catch Block ends");
	
//	}catch(StringIndexOutOfBoundsException siob) {
	}catch(NullPointerException np) {
		// NullPointerException np = new StringIndexOutOfBoundsException();
		
		System.out.println("Enter correct index");
	}
		System.out.println("Ending of the Code");
	}

	
}

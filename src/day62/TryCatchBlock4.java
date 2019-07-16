package day62;

public class TryCatchBlock4 {

public static void main(String[] args) {
		
		// NullPointerException ,  ArithmeticException
		
		
		System.out.println("Beginning of the code");
		
		String str = "abc";
		int num1 = 10;
		int num2 = 0;
		
		
		try {
			
			System.out.println("Try started");
			System.out.println(str.charAt(100));  // new StringOutOfBoundsException()
			System.out.println( num1/num2);	// -->> new ArithmeticException()
			System.out.println("Try Ended");
			
		// RuntimeException is super class of StringOutOfBoundsException, ArithmeticException
		} catch(Exception except) {
		
			// Exception except = new StringIndexOutOfBoundsException();  // This is what happening behind the scene
			// Exception except = new ArithmeticException();
			
			System.out.println("The message :  "+ except.getMessage());
			System.out.println("Some exception happened");
		
		
		}
		
		System.out.println("Ending of the Code");
		
		
		
		
	}

}

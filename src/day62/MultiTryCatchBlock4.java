package day62;

public class MultiTryCatchBlock4 {
	
	public static void main(String[] args) {
		
		// NullPointerException ,  ArithmeticException
		
		
		System.out.println("Beginning of the code");
		
		String str = "abc";
		int num1 = 10;
		int num2 = 0;
		
		
		try {
			
			System.out.println("Try started");
			System.out.println(str.charAt(1));  // new Strinh
			System.out.println( num1/num2);	// -->> new ArithmeticException()
			System.out.println("Try Ended");
		} catch(StringIndexOutOfBoundsException ex1) {
			System.out.println("Does not have that index");
		
		}catch(ArithmeticException ae1) {
			System.out.println("Do not divide by 0!!!");
		}
		
		System.out.println("Ending of the Code");
		
		
		
		
	}

}

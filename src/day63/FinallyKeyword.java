package day63;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		// HOW CAN WE MAKE SURE PROGRAM END GRACEFULLY
		// THE EXCEPTION OBJECT MUST BE CAUGHT BY A CATCH BLOCK
		// EVENTUALLY  TO END OR CONTINUE YOUR PROGRAMM GRACEFULLY
		
		// Objective: run certain code whether the exception occured or not
		
		System.out.println("START");
		try {
			
			System.out.println("Try Block");
			//throw new RuntimeException();
			
			// This is the only time that finally does not get to execute because JVM shutdown
			// System.exit(0);
		
		} catch(Exception e) {
		//} catch(ArithmeticException e) {
			
			System.out.println("Caught");
		
		}finally {
			System.out.println("This code run no matter we have exception or not");
		}
		
		//System.out.println("This code will run no matter we have exception or not");
		System.out.println("End");
	}
}

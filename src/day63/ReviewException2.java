package day63;

public class ReviewException2 {

	public static void main(String[] args) {
		
		// if you have multi try catch block and
		// if they have parent child relationship
		// the most specific exception should come first
		
		try {
			
			throw new ArithmeticException("6 divided by 0");
			
		}catch (ArithmeticException e1) {
			System.out.println("ArithmeticException happened");
			
		// We can use parent class type to catch multiple exceptions
		// if we want to take same exact action for all of them
		} catch (Exception e) {
			System.out.println("Exception Happen");
			
		}
		
		System.out.println("END");
		
	}
}

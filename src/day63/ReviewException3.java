package day63;

public class ReviewException3 {
	
	public static void main(String[] args) {
		
		// We want to take same action for
		// ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException
		// and everything else we want to take other general action
		
		try {
			
			// throw new ArithmeticException("6 divided by 0 ");
			//throw new ArrayIndexOutOfBoundsException();
			throw new ClassCastException();
			
		} catch ( ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Target Exception Happened");
		} catch (Exception e) {
			System.out.println("Not target Exception happened");
		}
			System.out.println("END");
	}

}

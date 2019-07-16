package day62;

public class ExceptionIntro {

	public static void main(String[] args) {
		
		//EXCEPTIONS ARE OBJECTS
		
		// ArrayIndexOutOfBoundsExeption
		int[] nums = {1,5,6};
		//System.out.println(nums[99] );
		
//		ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException();
//		System.out.println(aib);
		
		// throw keyword --->>> is used to throw exception manually
		
		//throw aib;
		
		//System.out.println(10/0);
		
		ArithmeticException ae = new ArithmeticException("DO NOT DIVIDE BY 0");
		System.out.println(ae);
		//throw ae;
		 //throw new ArithmeticException("NEW ARITHMETIC EXCEPTION");
		
		String str = null;
		System.out.println(str.length());
		
		
		NullPointerException np = new NullPointerException();
		System.out.println(np);
		throw np;
	
	}
}

package day52;

public class FinalKeyword {
				 //Instance variables can be accessed from everywhere
//	final int b; //Instance variable used with final keyword MUST BE  initialized before.
	
	final static int b;
	static {
		b = 20; //final static variables could be assigned inside  static block
	}
	
	final int c;
	
	{
	//	c = 100; // final instance variables could be assigned inside instance block
	}
	
	
	public FinalKeyword() {
		c = 90; // or final instance variables could be assigned inside Constructor 
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		final int a = 9;
//				  a = 10;//Final keyword means value cannot be modified	
			
		final int c;
				  c = 10;//Local variables  can be accessed inside the block
		System.out.println(c); 
		
	}
	
	/*
	 *   Final specifier --->>: value can not be modified 
	 * 				  applicable to variables, methods, class
	 * 
	 * 				Variable: can not reassign it's value,
	 * 						  instance variables MUST be initialized before first use:
	 * 												if it is static:  it can be initialized in static block
	 * 												if it is instance:  it is can be initialized either in constructor 
	 * 																	or in instance block
	 * 
	 * 				Method:   can not be overrided, 
	 * 						  but can be overloaded.
	 * 
	 * 			    Class:  can not be extended.
	 * 
	 * 
	 * 
	 */
	
	
	
}

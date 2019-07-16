package day52;

public class InitializerBlock {

	/*
	 * Instance block:  initializing variables. (belongs to object)
	 * 					execution depends on the creation of the object (just like constructor)
	 * 					executed before constructor
	 * 
	 * 
	 * Static block:  initializing class variables (belongs to class)
	 * 				  executes as soon as class  loaded
	 * 
	 */
	
	static {
		System.out.println("Static block");
	}
	
	
	{
		System.out.println("Initializer Block");
	}
	
	public InitializerBlock() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		InitializerBlock obj = new InitializerBlock();
		
		InitializerBlock obj2 = new InitializerBlock();
		
		
		
	}
	
}

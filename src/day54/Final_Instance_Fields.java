package day54;

public class Final_Instance_Fields {

	
	
	// FINAL FIELDS MUST BE INITIALIZED 
	// BEFORE THE OBJECT CREATION COMPLETED
	
	final int NUM = 100; //it is recommended to write your final variable name all UpperCase
	final int NUM1 = getNumber();
	final int NUM2;
	final int NUM3;
	
	
	{
		NUM2 = 200;
	}
	
	public Final_Instance_Fields() {
		NUM3 = 300;
		}
	
	
	private int getNumber() {
		
		return 150;
	}


	public static void main(String[] args) {
		
		
		// local final variable does not have to get initial value
		// IF NOT USED
		
		// local final variable can not be reassigned once
		// it get initial value
		final int x;
		
		Final_Instance_Fields f = new Final_Instance_Fields();
		System.out.println(f.NUM);
		System.out.println(f.NUM2);
		System.out.println(f.NUM3);
		
		//f.NUM = 200; can not reassign value for final variable
		
		System.out.println("THE END");
		
		}
	
	
}

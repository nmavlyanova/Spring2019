package day53;

public class Krypton extends Planet {

	public static void main(String[] args) {
		
	}
	
	
	@Override
	public void rotate() {
		System.out.println("Supermen's planet rotating");
	}
	
	//this is not valid since it does not have same return type
//	public int rotate() {
//		System.out.println("Supermen's planet rotating return int");
//	}
	
	
	//not valid since we can not reduce access modifier visibility
//	protected void rotate() {
//		System.out.println("Supermen's planet rotating protected");
//	}
	
	
	
	//This is not Overriding method
	//it is an Overloading the rotate method of super class
	protected void rotate(String x) {
	System.out.println("Supermen's planet rotating String");
}

	
}

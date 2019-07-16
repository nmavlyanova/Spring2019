package day62;

public class RecursiveMethodCall {

	public static void main(String[] args) {
		CallYou();
		System.out.println("End");
		
	}
	
	
	
	public static void CallMe() {
		
		CallYou();
	}
	
	
	public static void CallYou() {
		
		CallMe();
	}
	
}

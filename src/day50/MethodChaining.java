package day50;

public class MethodChaining {

	public static void main(String[] args) {
		
		//STEP 1
		methodA();
		//STEP 7--->>> END OF EXECUTION
		
	}
	
	public static void methodA() {
		
		//STEP 2
		methodB();
		
		//STEP 6
		System.out.println("A Called ");
	}
	
	public static void methodB() {
		
		//STEP 3
		System.out.println("B Called ");
		//STEP 4
		methodC();
		
	}
	
	public static void methodC() {
		
		//STEP 5
		System.out.println("C called");
	}
	
	
}

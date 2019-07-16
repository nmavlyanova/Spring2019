package day45;

public class Caller {

	public Caller() {
		//this(100);  CAN NOT CALL EACH OTHER
		System.out.println("calling no arg");
	}
	
	public Caller(int x) {
		this();
		System.out.println("calling 1 arg");
	}
	
	
	public static void main(String[] args) {
		
	}

}

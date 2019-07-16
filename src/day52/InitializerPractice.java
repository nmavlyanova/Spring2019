package day52;

public class InitializerPractice {

	int a;
	String b;
	boolean c;
	double d;
	
	{
		a=30;
		b="Cybertek";
		c=10>9;
		d=100_11;//underscore_ in Java used to read numbers easier
	}
	
	
	
	static int a1;
	static String b1;
	
	static {
		a1 = 100;
		b1 = "School";
	}
	
	public static void main(String[] args) {
		InitializerPractice obj = new InitializerPractice();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		System.out.println(a1 + " "+ b1);
		
	}
	
}

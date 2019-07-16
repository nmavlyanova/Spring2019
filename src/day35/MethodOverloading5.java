package day35;

public class MethodOverloading5 {

	public static void main(String[] args) {
		//Any literal non-fractional numbers will be seen as int
		//Any literal fractional numbers will be seen as double 
		
		//add(10, 12); the method add(double, int) is ambiguous for the type MethodOverloading5
		//add(10L, 12L); will not work, because 10L can be upcasted to 10D, but 12L cannot be used for int
		add(10d, (byte)12);
		
		add(9, 9.5);
		add(9, 10D);
		//add(9, 9);  The method add(double, int) is ambiguous for the type  MethodOverloading5

	}
	public static void add(double a, int b) {
		System.out.println("add ( double a, int b)");
	}
	
	public static void add(int b, double a) {
		System.out.println("add ( int b, double a) ");
	}
	
}

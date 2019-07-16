package day36;

public class WarmUp {

	public static void main(String[] args) {
		addSum(20,50);
		addSum(20f,50f);
		addSum(20.2,50.6);
		addSum(10,150);
		System.out.println("double value is "+addSum(20.5,50.0));
		

	}

	public static void addSum(int n1, int n2) {
		System.out.println("int value is "+(n1+n2));
	}
	
	public static double addSum(double n1, double n2) {
		return n1+n2;
		
	}
	
	public static void addSum(float n1, float n2) {
		System.out.println("float value is "+(n1+n2));
	}
}

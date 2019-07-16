package day38;

public class MethodOverloadingSelectionOrder {

	public static void main(String[] args) {
		doSomething(10);
		

	}
	
	public static void doSomething(int x) {
		System.out.println("int x "+ x);
	}
	public static void doSomething(long x) {
		System.out.println("long x" +x);
		
	}
	public static void doSomething(Integer x) {
		System.out.println("Integer x " +x);
	}
	public static void doSomething(int... x) {
		System.out.println("int... x"+ x);
	}
}

package day53;


//public final class Computer {
public class Computer {
	
	public final void systemPolicy() {
		System.out.println("Do not change this Policy");
	}
	
	public final void systemPolicy(int X) {
		System.out.println("Do not change this Policy");
}
	
	public final static void staticSystemPolicy() {
		System.out.println("Do not change this Static Policy");
	}
	
	
	public static void main(String[] args) {
		
		final int x = 100;
		
	}
	
}


class MacBook extends Computer{
//	@Override       THIS DOES NOT WORK CAN NOT OVERRIDE FINAL METHOD
//	public  void systemPolicy() {
//		System.out.println("HAHA I am just rebellious");
	
	//CAN NOT HIDE FINAL STATIC METHOD
//	public final static void staticSystemPolicy() {
//		System.out.println("HAHA I am just rebellious");
//	}
	
}
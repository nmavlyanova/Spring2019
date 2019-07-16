package day52;

public class Lion extends Tiger {

	public static void staticMethod() {
		
	}
	
	
	
	public void Test1() {
		
		Lion obj2 = new Lion();
		System.out.println(obj2.protectedStr);
	
		staticMethod();//we can call static method inside instance method
	}
	
	
	public static void main(String[] args) {
		
		Lion obj2 = new Lion();
		System.out.println(obj2.protectedStr);
//		Test1();//but we can not call instance method inside static method
				// we have to create the object and call with it		
		new Lion().Test1();
		
	}
	
}

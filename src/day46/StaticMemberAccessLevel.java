package day46;

public class StaticMemberAccessLevel {

	static int staticVar; //static variable|field
	int instanceVar;//instance variable
	
	
	public static void main(String[] args) {
		
		System.out.println("Value of static field num1 : "+ staticVar++);
		
		
		int num2;//local variable, it has to be initialized before first time usage
		//System.out.println(num2);
		
		//num3 is instance variable
		//we can not access any instance member in static method
		//System.out.println(num3);
		
		StaticMemberAccessLevel s1= new StaticMemberAccessLevel();
		System.out.println("VAlue of instance var num3: "+s1.instanceVar);
		
		s1.doSomething();
		
	}
	
	//what can we access inside instance method
	public void doSomething() {
		
		System.out.println("Inside instance method ");
		System.out.println("Instance variable : "+ instanceVar);
		System.out.println("Static variable : "+ staticVar);
	}
	
	
	//what can we access inside static method
	//no object needed when we call this method
	//static method ONLY CAN ACCESS STATIC MEMBERS !!!
	public  static void doStaticThing() {
		
		System.out.println("Inside Static method ");
//		System.out.println("Instance variable : "+ instanceVar);
		System.out.println("Static variable : "+ staticVar);
		
	}
	
}

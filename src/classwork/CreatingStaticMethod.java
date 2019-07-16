package classwork;

public class CreatingStaticMethod {
public static void sayHello(){
	System.out.println("HelloSpartan");
}

//taking external data
public static void sayHelloTo(String name){
	System.out.println("Greeting "+ name);
}

	public static void main(String[] args) {
		sayHello();
		sayHello();
		sayHello();
		sayGoodBye();
		sayGoodBye();
		sayGoodBye();
		sayHelloTo("Kids");
		

	}
	public static void sayGoodBye() {
		System.out.println("Bye Spartans");
	}

}

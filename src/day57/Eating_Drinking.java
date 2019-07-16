package day57;

public class Eating_Drinking {

	
	public static void main(String[] args) {
		
		IceCoffee cof = new IceCoffee("Tall");
		cof.drink();
		cof.eat();
		System.out.println(cof.toString());
	
	
	
		Burger b = new Burger("Double meat", "large");
		b.eat();
		System.out.println(b.toString());
	
	}
}

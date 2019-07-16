package day53;

public class TropicalFruit extends Fruit{
	
	
	
	//static method can not be Overridden, it can be Hidden
	//hiding static method
	public static void generateJuice() {
		System.out.println("Generate Tropical Juice");		
	}
		
	public static void main(String[] args) {
		
	generateJuice();
	Fruit.generateJuice();
	TropicalFruit.generateJuice();
	
	
}

}


//---------------------------------

class Fruit{
	
	public static void generateJuice() {
		System.out.println("Generate general Juice");
	}
}


package day57;

public class IceCoffee implements Drinkable{

	
	String size;
	
	public IceCoffee(String size) {
		super();
		this.size = size;
	}
	
	
	@Override
	public void eat() {
		System.out.println("I am eating a burger");
		
	}

	@Override
	public void drink() {
		System.out.println("I am drinking a coffee");
		
	}


	@Override
	public String toString() {
		return "IceCoffee [size=" + size + "]";
	}
	
	

}

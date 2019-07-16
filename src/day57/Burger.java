package day57;

public class Burger implements Edible {

	
	String name;
	String size;
	
	
	public Burger(String name, String size) {
		super();
		this.name = name;
		this.size = size;
	}


	@Override
	public void eat() {
			System.out.println("I am eating a burger from Burger class");	
	}


	@Override
	public String toString() {
		return "Burger [name=" + name + ", size=" + size + "]";
	}

	
	
	
}

package day58;

public class Dog extends Animal implements IndoorPet{

	public String breed;
	public String legCount = "Dog leg";
	
	@Override
	public void makeNoise() {
		System.out.println("WOOF WOOF");
	}
	
	public static void doStatic() {
		System.out.println("Dog Static");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", legCount=" + legCount + "]";
	}
	
	
}

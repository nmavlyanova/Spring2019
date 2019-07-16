package day58;

public class Horse extends Animal{

	public String color;
	public String legCount = "Horse leg";
	
	@Override
	public void makeNoise() {
		System.out.println("NEUGH NEIGH");
	}
	
	public static void doStatic () {
		System.out.println("Horse Static");
	}
}

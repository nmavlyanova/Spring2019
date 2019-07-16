package day50.difPackage;

import day50.Vehicle;

public class Airplane extends Vehicle{
	
//	private String brand;
//	private String model;
//	protected int year;
	private int wingCount;

	public int getWingCount() {
		return wingCount;
	}

	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}

	public Airplane(String brand, String model, int year, int wingCount) {
		//we already have functionality to set these 3 fields value
		//so we are just using super class constructor to set these values
		super( brand, model, year);	
		//could we have done it without above
		//setBrand(brand);
		//this.setBrand(brand);
		this.wingCount = wingCount;
	}
	
	
	public String toString() {
		return ("Airplane [Brand < "+ getBrand()+" >  model  < " +getModel()+ " > year  < "
				+year+" >  wing count < "+wingCount+" > ]" );
	}
	
	public static void main(String[] args) {
		
		Airplane a1 = new Airplane("Boeing", "737", 2020,4);
		System.out.println(a1);
		System.out.println(a1.toString());
		
		Vehicle v = new Vehicle("F73","Boeing", 2020);
		System.out.println(v.toString());
		
	}
	
	
	
	
}

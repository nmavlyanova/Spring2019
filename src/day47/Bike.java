package day47;

public class Bike {

	private String brand;
	private String gear;
	private int speed;
	private int id=100;
	
	private static int countOfBike;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public Bike(String brand, String gear, int speed) {
		//this();
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
		countOfBike++;
		this.id+=countOfBike;
	}

	private Bike() {
		System.out.println("No arg is being called");
	}
	
	public void speedUp(int increaseBy) {
		speed+=increaseBy;
	}
	
	public void slowDown(int decreaseBy) {
		for (int i = speed; i >speed-decreaseBy ; i--) {
			System.out.print( i+"-");;
			
		}
	}

	
	public String toString() {
		return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	}
	
	public static void showCurrentCount() {
		
		System.out.println("Current Count of Object is: "+countOfBike);
	}
	
	public static void resetCount() {
		countOfBike = 0;
	}
	
}

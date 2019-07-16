package day43;

public class Vehicle {

	private String model;
	private String make;
	private int speed;
	//To generate Getters and Setters AUTOMATICALLY
	//right click --
	//select source
	//select generate getters and setters
	//check the checkbox for the field you want 
	//then click generate
	
	public String getModel() {
		return model;
	}
	
	//<this> -- keyword can be used to address
	//the current object/instance being worked on
	public void setModel(String model) {
		//model=model;
		this.model=model;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String newMake) {
		this.make=newMake;
	}
	
	public int getSpeed() {
		return speed;//this.speed
	}
	public void setSpeed(int newSpeed) {
		this.speed = speed;
	}
	
	
	
	public  void increaseSpeed(int increaseBy) {
		for (int i = 1; i <=increaseBy; i++) {
			speed++;
			System.out.print(speed+"->");		
		}
		System.out.println();
	}
	
	public void decreaseSpeed(int decreaseBy) {
		for (int i = 1; i <=decreaseBy; i++) {
			speed--;
			System.out.print(speed+"->");
		}
		System.out.println();
	}
	
	
	public void stop() {
//		speed=0; //direct way
		this.speed=0; //using this keyword
//		setSpeed(0);
//		this.setSpeed(0);
	}
	
}

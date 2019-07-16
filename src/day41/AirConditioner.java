package day41;

public class AirConditioner {

	String brand;
	float currentTemp;
	boolean isOn;
	
	
	public void displayTheBrand() {
		System.out.println("The brand of AC is :  "+brand);
	}
	public void showCurrentTemp() {
		System.out.println(currentTemp);
	}
	public void displayAllInfo() {
		System.out.println("Brand: "+ brand+", Current Temperature: "+currentTemp+ ", AC is: "+ isOn);
	}
	public void turnOn() {
		if(!isOn==true) {
			isOn=true;
		System.out.println("AC is turned ON");
		}else{
		System.out.println("AC is already ON");	
		}
		}
	public void turnOff() {
		if(!isOn==true) {
			isOn=false;
			System.out.println("It has been turned off");
		}else {
			System.out.println("It is already off");
		}
		}
	public void increaseTemp(int incrDegree) {
		currentTemp+=incrDegree;
		}
	public void decreaseTemp(int decrDegree) {
		currentTemp-=decrDegree;
		//an instance method can be called inside
		//another instance method directly
		//just like an instance field
		//can be accessed directly inside any instance method
		showCurrentTemp();
		}
	public void setTemperature(int set) {
		currentTemp=set;
	}
}

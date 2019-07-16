package day41;

public class ACTester {

	public static void main(String[] args) {
		
		AirConditioner LG= new AirConditioner();
		LG.brand = "LG";
		LG.currentTemp = 77f;
		LG.isOn = true;
		
		LG.displayTheBrand();
		LG.showCurrentTemp();
		LG.turnOff();
		LG.increaseTemp(2);
		LG.displayAllInfo();
		
		
		
		
		AirConditioner Samsung = new AirConditioner();
		Samsung.brand = "Samsung";
		Samsung.currentTemp = 80f;
		Samsung.isOn = false;
		
		
		Samsung.displayTheBrand();
		Samsung.showCurrentTemp();
		Samsung.turnOn();
		Samsung.decreaseTemp(5);
		Samsung.displayAllInfo();
		
		
		
		AirConditioner Whirpool = new AirConditioner();
		Whirpool.brand = "Whirpool";
		Whirpool.currentTemp = 75f;
		Whirpool.isOn = false;
		
		Whirpool.displayTheBrand();
		Whirpool.showCurrentTemp();
		Whirpool.turnOn();
		Whirpool.decreaseTemp(5);
		Whirpool.displayAllInfo(); 
		
	}

}

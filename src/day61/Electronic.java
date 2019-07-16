package day61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Electronic {

	public abstract void turnOn();
	
	public static void main(String[] args) {
		
		int countComp = 0;
		int countAirCond = 0;
		
		
		List <Electronic> lst = new ArrayList<>();
		
//		Electronic e1 = new Computer();
//		Electronic e2 = new AirConditioner();
//		Electronic e3 = new Computer();
//		Electronic e4 = new AirConditioner();
//		Electronic e5 = new Computer();
//		Electronic e6 = new AirConditioner();
//		Electronic e7 = new Computer();
//		Electronic e8 = new AirConditioner();
		
		
		// THE LIST is expecting an instance of Electronic object
		// so we are passing any Object IS-A Electronic
		lst.add(new Computer());
		lst.add(new Computer());
		lst.add(new AirConditioner());
		lst.add(new Computer());
		lst.add(new AirConditioner());
		lst.add(new Computer());
		lst.add(new AirConditioner());
		lst.add(new Computer());
		lst.add(new Computer());
		
		for(Electronic each : lst) {
			each.turnOn();
			if(each instanceof AirConditioner) {
				countAirCond++;
				each = (AirConditioner)each;
				((AirConditioner) each).controlTemp();
			}else if (each instanceof Computer) {
				countComp++;
				each = (Computer)each;
				((Computer) each).code();
			}
		}
		System.out.println("Computer count : "+ countComp);
		System.out.println("AirConditioner count : "+ countAirCond);
		
		
		
//		e1.turnOn();
//		e2.turnOn();
//		
//		if(e1 instanceof Computer ) {
//			countComp++;
//		}else if (e2 instanceof AirConditioner) {
//			countAirCond++;
//		}
		
	}
}



class Computer extends Electronic{
	
	public void code() {
		System.out.println("Computer ready to code");
	}

	@Override
	public void turnOn() {
		System.out.println("Turning on computer");
		
	}	
}


class AirConditioner extends Electronic{
	
	public void controlTemp() {
		System.out.println("AC is controlling temperature");
	}

	@Override
	public void turnOn() {
		System.out.println("Turning on Air Conditioner");
		
	}
	
	
}
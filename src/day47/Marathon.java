package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class Marathon {

	
	public static void main(String[] args) {
		
		Bike b1 = new Bike("Mongoose", "Helmet", 20);
		Bike b2 = new Bike("Mongoose", "Helmet", 17);
		Bike b3 = new Bike("Kawasaki", "Gear", 25);
		
		
		//Bike.showCurrentCount();
		System.out.println(b1.toString());
		b2.toString();
		b3.toString();
		
		b1.slowDown(5);
		
		ArrayList<Bike> bikeLst = new ArrayList<>(Arrays.asList(b1,b2,b3));
		
		for (int i = 0; i < bikeLst.size(); i++) {
			System.out.println(bikeLst.get(i));			
		}
		System.out.println("----------------");
		
		for(Bike each: bikeLst) {
			System.out.println(each.getId()+"---"+ each.getBrand());
			each.speedUp(15);
			System.out.println(each.toString());
		}
		
		System.out.println("-----------------");
		
		
		
		Bike.resetCount();
		Bike.showCurrentCount();//-->>Bike count starts 0
		
		Bike b5 =new Bike("Yamaha", "4",88);
		System.out.println("Current ID of b5 is: "+ b5.getId());
		
		Bike b6 = new Bike("Harley", "3",70);
		System.out.println("Current ID of b6 is: "+ b6.getId());
		
		
	}
}

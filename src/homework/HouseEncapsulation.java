package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseEncapsulation {

	public static void main(String[] args) {
		
		House house1 = new House();
		house1.type = "Town House";
		house1.address = "123 Main str, Wi";
		house1.bedrooms = 3;
		house1.yearBuilt = 1986;
		
		House house2 = new House();
		house2.type = "Single Family House";
		house2.address = "555 Jones rd, TN";
		house2.bedrooms = 4;
		house2.yearBuilt = 1997;
		
		House house3 = new House();
		house3.type = "Condo";
		house3.address = "66985 Green apple rd, UT";
		house3.bedrooms = 6;
		house3.yearBuilt = 1970;
		
		
		House[] houses = new House[3];
		houses[0]= house1;
		houses[1] = house2;
		houses[2] = house3;
		
		System.out.println(houses[0].address);
		
		
		for( House h: houses) {
			System.out.println(h.address);
			}
		for (int i = 0; i < houses.length; i++) {
			System.out.println(houses[i].type +"=>"+ houses[i].bedrooms);
		}
		
		System.out.println("----ARRAYLIST OF HOUSE OBJETCS----");
		
		ArrayList<Integer> numsLst= new ArrayList<>();
		
		ArrayList<House> houseLst = new ArrayList<>();
		houseLst.add(house1);
		houseLst.add(house2);
		houseLst.add(house3);
		
		ArrayList<House> houseLst1=new ArrayList<>(Arrays.asList(house1,house2,house3));
		List<House> hoseLst2=Arrays.asList(houses); //fix size arraylist, we can not add another house
		
		//print year of each house object in ArrayList if year is between 1980 and 1990
		
		for( House year: houses) {
			if(year.yearBuilt>=1970&&year.yearBuilt<=1990) {
				System.out.println("year built: "+year.yearBuilt+" address:"+ year.address);
				
			}
		}
		for(int i=0; i<houses.length; i++) {
////			if(houses[i].yearBuilt>=1970&&houses[i].yearBuilt<=1990) {
//				System.out.println("year built: "+houses[i].yearBuilt + "address: "+ houses[i].address );
			House tempHouse=houseLst.get(i);
				if(tempHouse.yearBuilt>=1970&&tempHouse.yearBuilt<=1990) {
					System.out.println("year built: "+houses[i].yearBuilt + "address: "+ houses[i].address );
			}
		}	
	}
		
		
}

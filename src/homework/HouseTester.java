package homework;

public class HouseTester {

	public static void main(String[] args) {
	
	House houseObj=new House();
	houseObj.type = "Dom";
	houseObj.address="Gulobod, 5, 35, Tashkent";
	houseObj.bedrooms=3;
	houseObj.yearBuilt=1979;
	
	House houseObj2=new House();
	houseObj2.type = "Uchastok";
	houseObj2.address="Beshyogoch,6-56";
	houseObj2.bedrooms=6;
	houseObj2.yearBuilt=1966;
	
	
	
	printHouseInfo(houseObj);
	printHouseInfo(houseObj2);
	House newHouse=buildAHouse("GrayJay Ct, Tx", "Single Family House", 2015, 4) ;
	System.out.println(buildAHouse("GrayJay Ct, Tx", "Single Family House", 2015, 4).address );
	printHouseInfo(buildAHouse("GrayJay Ct, Tx", "Single Family House", 2015, 4) );
	printHouseInfo(newHouse);
	
	
	}
	

	public static void printHouseInfo(House hObj) {
		System.out.println("==========");
		System.out.println("Type: "+ hObj.type);
		System.out.println("Address: "+ hObj.address);
		System.out.println("Bedroom #: "+ hObj.bedrooms);
		System.out.println("Year: "+ hObj.yearBuilt);
		System.out.println("==========");
			
}
	
	public static House buildAHouse(String adr, String tpe, int year, int rooms) {
		House house=new House();
		house.address=adr;
		house.type=tpe;
		house.yearBuilt=year;
		house.bedrooms=rooms;
		
		
		return house;
	}

}

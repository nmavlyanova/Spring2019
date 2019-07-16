package day40;

public class ComputerFactory {


	
	public static void main(String[] args) {
		Computer iMac = new Computer();
		Computer macPro = new Computer();
		
		System.out.println("----IMAC----");
		iMac.type = "Mac Desktop";
		iMac.ram= 128;
		iMac.screenSize= 27.0;
		iMac.color = "Silver";
		iMac.OS = "MacOS";
		iMac.isPersonal=true;
		
		
		
		System.out.println(iMac.type);
		System.out.println(iMac.ram);
		System.out.println(iMac.screenSize);
		System.out.println(iMac.color);
		System.out.println(iMac.OS);
		System.out.println(iMac.isPersonal);
		
		
		
		System.out.println("----MACPRO----");
		System.out.println(macPro.type);
		System.out.println(macPro.ram);
		System.out.println(macPro.screenSize);
		System.out.println(macPro.color);
		System.out.println(macPro.OS);
		System.out.println(macPro.isPersonal);
		
		
	}


}

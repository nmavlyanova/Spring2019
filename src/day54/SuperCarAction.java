package day54;

public class SuperCarAction {

	public static void main(String[] args) {
		
//    	Engine e1 = null;
//		e1.start();
		Engine e = new Engine("V", 12);
		System.out.println(e.toString());		
		
		SuperCar s = new SuperCar("Honda Pilot", e );
		s.start();
		System.out.println(s.toString());
	
	
	
	}
}

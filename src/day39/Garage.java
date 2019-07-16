package day39;

public class Garage {

	public static void main(String[] args) {
		
		
		//default values for fields
		//if it is not defined
		/*
		 * Any reference type field --> null
		 * Any whole numbers type --> 0
		 * Any fractional numbers type -->0.0
		 * char --> empty char ascii 0
		 * boolean -->false
		 * 
		 */
		
		//int i;
		//This does not compile
		//local variable need to be initialized before usage
		//System.out.println(i);
		
		
		Car c1= new Car();
		c1.make = "Toyota";
		c1.model = "Camry";
		c1.year = 2018;
		c1.price = 25000;
		c1.horsePower = 200;
		
		
		
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.year);
		System.out.println(c1.price);
		System.out.println(c1.horsePower);
		
		
	}

}

package day46;

/*
 * Design pattern -- set of common programming practices to solve certain problems
 * 
 * Singleton Patterns:
 *  --> a pattern to make sure single instance of object is created 
 *  	during entire runtime of the application
 *   
 */



public class FlyingCars {

	private FlyingCars() {
		
	}
	
	public static FlyingCars getInstance() {
		FlyingCars f1 = new FlyingCars();
		return f1;
	}
}

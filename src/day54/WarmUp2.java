package day54;

import java.util.Random;

public class WarmUp2 {

	
	//How can we initialize fields value
	/*
	 * If no action is taken, default value will be provided
	 * We can directly assign value with value
	 *	 or we can call a method
	 * it can be initialized in initializer block
	 * it can be initialized in constructor 
	 * 
	 */
	
	
	
			  //optional assignment with method
	int num = getANumber(); //100;
	
	
	public static void main(String[] args) {
		
		WarmUp2 w1 =  new WarmUp2();
		System.out.println(w1.num);
	}
	
	
	public int getANumber() {
		
		Random r = new Random();
		int number = r.nextInt(100 );		
		return number;
		
	}
}

package day63;

import java.io.FileNotFoundException;

// WE CAN DECLARE MULTIPLE EXCEPTION TYPE IN METHOD SIGNATURE BY SEPARATING BY COMMA

public class MethodThatMightThrowMultipleCheckedException2 {

	public static void main(String[] args)  {
		
		System.out.println("Beginning");

		try {
			doSomethingDangerous();
//		} catch (FileNotFoundException | InterruptedException e) {
//			System.out.println("Same exact action");
		}catch(Exception e) {
			System.out.println("Caught Exception");
		}
		
		System.out.println("Ending");
	}
	

	public static void doSomethingDangerous() throws InterruptedException, FileNotFoundException{
		System.out.println("Some dangerous action with multiple consequences");
		throw new InterruptedException();
	}
}

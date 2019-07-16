package day62;

public class DangerZone {

	public static void main(String[] args) {
		
		
		System.out.println("Beginning");
		// CALLING A METHOD THAT MIGHT THROW A CHECKED EXCEPTION
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("i is : "+ i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			System.out.println("Caught");
			
		}
			
		}
		
		
		System.out.println("Ending");
	}
}

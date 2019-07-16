package day63;

import java.io.IOException;

public class MethodThatMightThrowUncheckedException {

	public static void main(String[] args) {
		System.out.println("Beginning");
		try {
			playWithWater();
//		} catch (Exception e) {     OR
		}catch (RuntimeException | IOException e) {
			System.out.println("Caught");
		}
		System.out.println("Ending");
		
	}
	
	public static void playWithWater() throws RuntimeException, IOException {
		
		System.out.println("play with Water");
		throw new RuntimeException();
	}
}

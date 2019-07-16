package day63;

import java.io.IOException;

public class MethodThatMightThrowCheckedException {

	public static void main(String[] args) {
		
		// handle or declare
		try {
			playWithFire();
		} catch (IOException e) {
			System.out.println("Caught ");
		}
		
		
		// The only indication that tell you,
			// you must handle or declare an exception when you try to call a method is
			// THE METHOD SIGNATURE
			// If the method signature document that this method call might throw 
			// some type of CHECKED EXCEPTION  then the caller must handle or declare
		waitFewSecond(3);
		
	}
	
	// handle or declare
	public static void playWithFire() throws IOException {
		
		System.out.println("Playing with Fire");
		
		throw new IOException();
		
//		try{
//			throw new IOException;
//		}catch(IOException e) {
//			System.out.println("Caught Exception");
//	}
	}
		
		
	public static void waitFewSecond(int second)  {
		try {
			Thread.sleep(second*1000);
			
		} catch (InterruptedException e) {
			System.out.println("Caught againg");
		}
}
}
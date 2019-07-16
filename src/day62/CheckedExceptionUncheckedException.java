package day62;

import java.io.IOException;

public class CheckedExceptionUncheckedException {

	public static void main(String[] args) {
		
		System.out.println("Beginning");
		// throw
		//throw new RuntimeException();
		
		
		
		// We are required to handle checked exception at compile time
		// or it will NOT COMPIlE
		try {
			
			System.out.println("DOING SOME IO INTESIVE ACTIONS");
			System.out.println("Reading a File");
			
			throw new IOException();
			
			// throw new Exception(); Will not work BECAUSE
			// Exception is super type of IOException and can not be caught in this catch block
		
		} catch (IOException e) {
			// IOException e = new Exception();
			
			System.out.println("Caught!!!");
		}
		System.out.println("Ending");
		// We are not required to handle unchecked exception at compile time
		// BUT If an exception object created, and can not find any catch block
		// that contain this exception object, it will still throw the EXCEPTION
		// to the console
		
		throw new RuntimeException();
	}
}

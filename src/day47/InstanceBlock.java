package day47;

import java.util.Random;

public class InstanceBlock {

	int num;
	
	//a block that run every time an object being created
	//instance block
	
	{
		System.out.println("Initializing the Launch");
		System.out.println("Setting Protocol");
		System.out.println("Checking fuel level");
		System.out.println("All System GO!!! ");
		Random r = new Random();
		num = r.nextInt(100);
		
		
		
	}
	
	public InstanceBlock() {
		System.out.println("Constructor");
	}
	
	public InstanceBlock(String name) {
		System.out.println("Constructor "+ name);
	}
	
}

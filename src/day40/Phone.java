package day40;

public class Phone {

	
	//these instance variable
	//cn be accessed
	//inside instance methods directly
	//just like it's a local variable
	//for that method
	
	//if you are outside class
	//you need an object to access
	//these attributes
	
	String type;
	String OS;
	int capacity;
	
	
	public  void ring() {
		System.out.println("Ringing");
	}

	public  void dial(long number) {
		System.out.println(number + " is calling");
	}
	public  void displayPhoneInfo() {
		
		System.out.println("Phone type: " + type+ ", Operating System: "+ OS+ ", Capacity: "+ capacity);
	}
	
	
	
	}



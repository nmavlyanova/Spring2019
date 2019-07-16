package day49;

public class Phone extends Device{
	String brand;
	int screenType;
	
	
	//what is the difference between super and this
	/*
	 * this(args..) is used to call constructor of same class
	 * in another constructor 
	 * 
	 * 
	 * super(arg..) is used to call super class's
	 * constructor
	 * 
	 * 
	 * Suoer(args..) rules:
	 *   	it has to be the first statement
	 *   	it can only be used one time per constructor
	 *   	super() and this() can not be mixed together
	 * 
	 */
	
public Phone() {
	//super();
	super(100);
	System.out.println("Phone Constructor");
}
	


	public Phone(String brand, int screenType, int serialNumber) {
	super(serialNumber);
	this.brand = brand;
	this.screenType = screenType;
	//this.serialNumber = serialNumber;
}



	public static void main(String[] args) {
		
		//Phone p = new Phone();
		Phone p1 = new Phone("Iphone", 7, 123);
		
		System.out.println(p1.brand);
		System.out.println(p1.screenType);
		System.out.println(p1.serialNumber);
		
		
		
	}
}



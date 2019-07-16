package day56;

// interface is an abstract type
// just like abstract classes

public interface Teachable {
	
	// as of java7
	// interface could only have CONSTANT and abstract method
	public static final boolean STUDY_HARD = true;
	public static final String SCHOOL =  "Cybertek";
	// any field you have AUTOMATICALLY BECOME PUBLIC STATIC FINAL
	// even though you will not mention it
	String SCHOOOL = "Cybertek1";
	
	public abstract void canLearn();
	// any method without body or access modifier 
	// it is automatically public and abstract
	
	// very common interview | exam questions goes as :
	// not providing access modifier in interface
	// and overriding the method with default access modifier
	// DOES NOT COMPILE!!!
	void canLearn1();
	public abstract void doHomework();

}

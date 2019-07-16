package day50;

public class ExtremeSport extends Sport {

	//this is the Optional annotation to make sure
	//you have overriden the method correctly
	
	//same method name
	//same method parameter list
	//same return
	//same access modifier
	//this method is in sub class
	//this is an instance method
	
	@Override
	public void doSport() {
		System.out.println("Printing extreme  sport --- Sky diving");
	}
	@Override
	public String toString() {
		return "Extreme message";
	}
	
	
	
	public static void main(String[] args) {
		ExtremeSport e1 =  new ExtremeSport();
		e1.doSport();
		System.out.println(e1.toString());
		
	}
	
}

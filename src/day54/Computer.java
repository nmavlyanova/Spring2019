package day54;

public class Computer extends Electronic {

	//@Override  //This is a new method, it is not Overridden
	public void turnOn() {
		System.out.println("Computer");
	}
	
	@Override
	//overridnig method in sub class can be optionally final 
	  //to block sub class of computer overriding turnOff
	public final void turnOff() {
		System.out.println("Computer off");
	}
	
}





class Electronic{
	private void turnOn() {
		System.out.println("Electronic");
	}
	
	public void turnOff() {
		System.out.println("Electronic off");
	}
	
}
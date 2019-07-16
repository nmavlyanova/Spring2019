package day56;

// IMPLEMENTING AN INTERFACE ALSO BUILDING A PARENT-CHILD RELATIONSHIP

// WE USE IMPLEMETNS KEYWORD RATHE THAN EXTENDS used by class
// the class must implements every abstract method

public class OnlineStudent implements Teachable{
	
	@Override
	public void canLearn() {
		System.out.println("can learn by hardwork");
	}
	
	@Override
	public void doHomework() {
		System.out.println("will do all homeworks");
	}


	
	public static void main(String[] args) {
		
		
		System.out.println(Teachable.STUDY_HARD);
		System.out.println(STUDY_HARD);
		
		OnlineStudent o = new OnlineStudent();
		o.canLearn();
		o.doHomework();
		
		//Teachable t = new Teachable(); //  WILL NOT COMPILE, we can not create an object out of interface
	
	
	}

	@Override
	public void canLearn1() {
		// TODO Auto-generated method stub
		
	}
	
	
}

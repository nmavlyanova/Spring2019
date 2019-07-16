package day51;

public class Horse extends Animal {
 
	
	//everytime horse makes noise
	//it should make animal noise first
	//then it should make horse specific noise
	
	@Override
	public void makeNoise() {
	
		//System.out.println("General noise");
		super.makeNoise();
		
		//all below 3 statements are legal!!!
		//super.eat();
		//eat();
		//this.eat();
		System.out.println("Horse : NAi NAi NAi");
	}
	
	/*
	 * public void eat(){
	 * System.out.println("eating !!!");	  
	 * }
	 */
	 
	
	
}
package day53;

public class EBook extends Book{

	//SUB CLASS CAN HIDE SUPER CLASS'S FIELD BY DECLARING IT
	//THE ONLY THING MATTER IS THE <NAME> !!!
	float name = 12.1f;
	long page = 12356l;
	static double weight = -1;
	
	
	public static void main(String[] args) {
		
		EBook b = new EBook();
		System.out.println(b.name);
		System.out.println(b.page);
		b.showVAlues();
		
		
	}
	
	
	public void showVAlues() {
		System.out.println(super.name + "---"+ this.name);
		System.out.println(super.page + "---"+ this.page);
		
		//static fields can be accessed directly in instance method
		//or we can make it obvious to call way EBook.weight
		System.out.println(super.weight + "---" + this.weight);
													 //weight
													 //EBook.weight
		
	}
}





//-----------------------
//We can have more than one class in one source file
//However only one should be public

 class Book{
	
	 String name = "Book";
	 int page = 25;
	 double weight = 1.2;
	
	
}
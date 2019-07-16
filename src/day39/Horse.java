package day39;

public class Horse {

	
		//instance field/variable
		// to define properties/attributes of objects
		//that being created out of this class
	
		String breed;
		int age;
		String color;
		double height;
	

public static void main(String[] args) {
	
	
	//each object attributes
	//are completely independent from
	//any other objects that created
	//from same class
	
	Horse h1 = new Horse();
	h1.age=2;
	h1.breed= "Mustang";
	h1.color="brown";
	h1.height = 7.2;
	
	Horse h2 = new Horse();
	h2.age=5;
	h2.breed= "Arabian";
	h2.color="black";
	h2.height = 5.2;
	
	
	System.out.println(h1.color);
	System.out.println(h2.height);
	//reassigned to new value
	h1.color= "black";
	System.out.println(h1.color);
	System.out.println(h2.color);
	
	
	//if you directly print out h1 
	//you will get hash code
	System.out.println(h1);// .toString
	System.out.println("Breed : "+ h1.breed+ "; Heght : " + h1.height+ "; Age: "+ h1.age+ "; Color : "+ h1.color);
	
	
	
	
	
	
}

}

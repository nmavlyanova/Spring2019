package day58;

public class AnimalShow {

	public static void main(String[] args) {


		// Dog is a dog		
	//reference type        actual object type
		Dog   d         =        new Dog();
		
		// Dog is an Animal
	// reference type       actual object type
		Animal a1       =        new Dog();
		
		// Dog is an IndoorPet
	// reference type       actual object type
		IndoorPet i1    =        new Dog();
		
		
		// Horse
		Horse h1  = new Horse();
		Animal a2 = new Horse();
	// Horse and IndoorPet has no relationship
	//	IndoorPet i2 = new Horse();
		
		
		
		
		
		
		
		

	}

}

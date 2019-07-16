package day61;

import day58.*;

public class InstanceOf {

	public static void main(String[] args) {
		
		Animal a = getMyAnimal();
		
		String objName = a.getClass().getSimpleName(); 
		System.out.println(objName);
		
		// instanceof operator is for checking your
		// object type IS-A the type you specified
		
		//Cat c1 = (Cat) a;
		boolean isDog = a instanceof Dog;
		System.out.println(" is a1 pointing to a Dog : " + isDog);
	
	
		boolean isCat = a instanceof Cat;
		System.out.println(" is a1 pointing to a Cat : " + isCat);
		
		if(isDog==true) {
			Dog d1 = (Dog)a;
			System.out.println(d1.legCount);
		}else if(isCat==true) {
			Cat c1 = (Cat)a;
			System.out.println(c1.legCount);
		}
	
		
		// if the object type of ref variable a. pointing to IS-A the type
		//you are checking using instance of keyword
		boolean isAnimal = a instanceof Animal;  // ObjectType Dog IS-A Animal or not
		System.out.println("  is pointing to a type of Animal : "+ isAnimal);
		  
		
		boolean isObject = a instanceof Object;  // ObjectType Dog IS-A Object or not
		System.out.println("  is pointing to a type of Object : "+ isObject);
		
		
		// CAN NOT USE INSTANCE OF KEYWORD FOR UNRELATED TYPES!!!
//		boolean isShape = a instanceof Shape;  // ObjectType Dog IS-A Shape or not
//		System.out.println("  is pointing to a type of Shape : "+ isShape);
		
		
}
	
	public static Animal getMyAnimal() {
		Dog d = new Dog();
		return d;
	}
}

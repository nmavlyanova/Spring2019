package day48;

import day49.Animal;

public class Horse extends Animal {

	/*
	 * 
	 * WE DON'T INHERIT SOMETHING WE DON'T SEE
	 * ALL COLOR, WILD LEGCOUNT have default 
	 * access modifier. If Animal is in different
	 * package, they will not be visible in this package
	 *  
	 */
	
	int shoesCount;
	int horsePower;

	
	
	
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.wild = false;
		
		
//		System.out.println(a1.breed);
//		System.out.println(a1.color);
//		System.out.println(a1.legCount);
		System.out.println(a1.wild);
		
		
		Horse h1 = new Horse();
//		h1.breed = "MUstang";
		h1.color = "color";
		h1.horsePower = 600;
//		h1.legCount = 4;
//		System.out.println(h1.breed);
		System.out.println(h1.color);
		System.out.println(h1.horsePower);
//		System.out.println(h1.legCount);
		
		
		
		
	}
	
}



package day48;

import day49.Animal;


//if the field is in the same package but different clas
//protected, default are both accessible

// if the field is in the different package in sub class
//protected and public are visible

public class Outsider extends Animal {
 
	public static void main(String[] args) {
	
		//Animal is in different package
		 //Animal a = new Animal();
		 
		Outsider o = new Outsider();
		System.out.println(o.color);
		System.out.println(o.wild);
		//System.out.println(o.legCount);
		 
		
}
	
	
}

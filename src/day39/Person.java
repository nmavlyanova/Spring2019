package day39;


import java.util.Scanner;

public class Person {
	
	//properties|attributes of
	//the object are defined
	//by instance variable/field
	String name;
	int age;
	char gender;	
	

	
	//public static void eat() {
	//any non-static method is called instance method
	public void eat() {
		
		System.out.println("Eating");
	}
	
	public void tellMeYourName() {
		System.out.println("My name is "+ name);
	}
	
	public void printPersonInfo() {
		System.out.println("My name is "+ name
						+" | my age is: "+ age 
						+" | my gender is: "+gender);
	}
	
	}


package day40;

import java.util.ArrayList;

public class UsingTypeComputer {

	public static void mail (String[] args) {
	//What can we do when we have a class
			/*
			 * Create object out of it

			 * It will become a type
			 * Create reference variable Computer iMac
			 * Use it as method parameter
			 * Use it as method return type
			 * Use it as type for ArrayList object
			 * 
			 */
			
			
			Computer myComputer = new Computer();
			ArrayList<String> lst = new ArrayList<>();
			ArrayList<Computer> comLst = new ArrayList<>();
			comLst.add(myComputer);
			comLst.add(new Computer());
			
			String   str    = new String("actual String");
			String[] strArr = new String[3];
			
			
			Computer   myComp = new Computer();
			Computer[] comArr = new Computer[3];
			
			
			
			printComputer(myComp);
			
			
			Computer com1 = getComputer();
			
			
	}

	
	
	//created a method that accept computer as parameter
	//so when we call this method
	// we will pass computer object as an argument
	public static void printComputer(Computer comObject) {
		System.out.println("Computer object"+ comObject);
	}
	public static  void printString(String strObject) {
		System.out.println(strObject);
	}
	
	
	
	
	
	//we created a method that return computer object
	public static Computer getComputer() {
		//in order to return computer object
		//first we need to create an object
		Computer iMac= new Computer();
		iMac.OS="Mac OS";
		return iMac;//returned computer object
	}
	public static String getString() {
		return "my string";
	}
	
	
	
}
package day31;

import java.util.Arrays;

public class MethodReturnTypeIntro {

	public static void main(String[] args) {
		
		String name = "Jon Snow";
		
		int count = name.length();
		
		System.out.println(count);
		
		String nameStr=Arrays.toString(name.toCharArray());
		
		int five = giveMeFive();
		
		System.out.println(five);
		System.out.println(giveMeFive());
		
		
		String myName = giveMeMyName();
		System.out.println(myName);
		
		System.out.println(giveMeMyName());
		System.out.println(myName.substring(0,2));
		
		
		
	}
	public static String giveMeMyName() {
		return "Nodira";
	}
	
	public static int giveMeFive() {
		return 5;
	}

}

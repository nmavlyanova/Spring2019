package day35;

import java.util.Arrays;

public class MethodOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Barry";
		char[]nameChars = name.toCharArray();
		System.out.println(Arrays.toString(nameChars));
		
		//getting an each char as String array
		String[] nameCharsStr=name.split("");
		System.out.println(Arrays.toString(nameCharsStr));
		
		
		Arrays.sort(nameCharsStr);
		//System.out.println(Arrays.sort(nameCharsStr));
		
	}

}

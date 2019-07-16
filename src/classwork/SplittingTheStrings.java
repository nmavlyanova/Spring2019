package classwork;

import java.util.Arrays;

public class SplittingTheStrings {

	public static void main(String[] args) {
		
		
		String name = "Nodira Farrukh";
		
		String[] words = name.split(" ");
		System.out.println(Arrays.toString(words));
		
		
		String[] parts = name.split("a");
		System.out.println(Arrays.toString(parts));
		
		
		String[] parts2 = name.split("is");
		System.out.println(Arrays.toString(parts2));
		
		
		
	}

}

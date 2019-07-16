package classwork;

import java.util.Scanner;

public class ForEachLoopPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//word
		System.out.println("Enter a word");
		String  str = "";
		str = scan.nextLine();
		
		char[] myChars = str.toCharArray();
		for( char eachChar: myChars) {
			System.out.println(eachChar+ "-");
		}
		
		//another way
		String[] splitted = str.split("");
		for( String each : splitted) {
			System.out.println(each+"-");
		}
		
		
		
		//sentence
		
		System.out.println("Enter a sentence");
		str = scan.nextLine();
		
		String[] splitted1 = str.split(" ");
		for (String eachWord : splitted1) {
			System.out.println(eachWord);
			
		}
		
		
	}

}

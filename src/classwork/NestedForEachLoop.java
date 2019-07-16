package classwork;

import java.util.Scanner;

public class NestedForEachLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		
		String[] splitted1 = str.split(" ");
		for (String eachWord : splitted1) {
			//System.out.println(eachWord);		
		//String word = "Break time";
		char[] wordChars= eachWord.toCharArray();
		for (char c : wordChars) {
			System.out.print(c + "-");
		}

	}}

}

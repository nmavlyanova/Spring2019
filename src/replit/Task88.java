//Print true if the string "cat" and "dog" appear the same number of times in the given string word. 
//Example:
//input: catdog
//output: true
//
//Example:
//input: catcat
//output: false



package replit;

import java.util.Scanner;

public class Task88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int countOfCats = 0;
int countOfDogs = 0;
String word = scan.next();
int length = word.length()-1;
for (int i =0; i<=length; i++) {
	if (word.charAt(i)=='c'&&word.charAt(i+1)=='a'&&word.charAt(i+2)=='t') {
		countOfCats++;
	}else if (word.charAt(i)=='d'&&word.charAt(i+1)=='o'&&word.charAt(i+2)=='g') {
		countOfDogs++;
}
	}if (countOfCats==countOfDogs) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}

}
}
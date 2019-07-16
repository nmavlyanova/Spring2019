package classwork;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayPractice {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String name = scan.next();

//char[] newName = new char [name.length()];
//
//for (int i = 0; i < newName.length; i++) {
	
char[] newName = name.toCharArray();
System.out.println(Arrays.toString(newName));
	
int count =0;
for (int i = 0; i < newName.length; i++) {
	if(newName[i]=='a') {
		count++;
	}
	
}System.out.println(count);
		
		
		

	}

}

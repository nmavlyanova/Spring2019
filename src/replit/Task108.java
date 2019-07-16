//Assume that the int variables i and j have been declared, and that n has been declared and initialized.
//Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.
//
//Example:
//input: 5
//output: *
//output: **
//output: ***
//output: ****
//output: *****
//
//Example:
//input: 3
//output: *
//output: **
//output: ***


package replit;

import java.util.Scanner;

public class Task108 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
	
	
//	for (int i = 1; i <= n; i++) {
//		for (int j = 1; j <= i; j++) {
//			System.out.print(j+ " ");
//		}System.out.println();
//	}
//		for (int i = 'A'; i <= 'Z'; i++) {
//			for (int j = 'A'; j <=i; j++) {
//				System.out.print((char)j+" ");
//			}System.out.println();
//		}
//		
	for (int x = 1; x <=3; x++) {
		
	for (int i = 1; i <=n ; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("* ");
		}System.out.println();
	}System.out.println();
		
		
	}
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}

package homework;

import java.util.Scanner;

public class Task75 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int i=1;
		int factorial =1;
		
		int num = scan.nextInt();
		while (i<=num) {
			factorial*=i;
			i ++;
		}
		System.out.println(factorial);
	}

}

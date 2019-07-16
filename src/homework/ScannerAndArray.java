package homework;

import java.util.Scanner;

public class ScannerAndArray {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int[] array = new int [3];
		int max = array[0];
		
		for (int j = 0; j < array.length; j++) {
			
		
		System.out.println("Enter number"+ (j+1));
		array[j]= scan.nextInt();
		System.out.println(array[j]);
		}
		
		
		for (int i = 1; i < array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}System.out.println(max);
}
		}
		
	



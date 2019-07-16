//Binary number is a number expressed in the base-2 numeral system or binary numeral system, which uses only two symbols: typically 0 (zero) and 1 (one). Each digit is referred to as a bit.
//
//
//
//
//
//Given an int variable decimal,  write java program to calculate binary value of the decimal variable and assign it binary array. print out value of binary array matching below format. Feel free to use additional arrays or formulas.
//
//Example:
//decimal -> 3
//binary -> [0, 0, 0, 0, 0, 0, 1, 1]
//
//decimal -> 35
//binary -> [0, 0, 1, 0, 0, 0, 1, 1]
//
//decimal -> 255
//binary -> [1, 1, 1, 1, 1, 1, 1, 1]
//
//





package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Task119 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    int binaryNew[] ={128,64,32,16,8,4,2,1};
	    
	    
	    for (int i = 0; i < binaryNew.length; i++) {
			if(decimal>=binaryNew[i]) {
				binary[i]=1; 
				decimal=decimal-binaryNew[i];
				
				
			}
		}
	    System.out.println(Arrays.toString(binary));   
	    
	    
	    
	}

}

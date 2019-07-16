package day34;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArrayFrom1ToX(17)));
	}

	public static int[] getArrayFrom1ToX(int x) {
	int []arr = new int [x];
	 
		for (int i = 0; i <arr.length; i++) {
			arr[i]=i+1;
			
			
		}System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	
	
	public static int[] countFrom1ToN(int n) {
		int[] arrNum= new int [n];
		for(int j=0; j<arrNum.length; j++) {
			
		}
		
		
		return null;
	}
	
	
	
}

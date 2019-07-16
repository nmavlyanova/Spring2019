package day34;

import java.util.Arrays;

public class TwoDPrinter {

	public static void main(String[] args) {
		//System.out.println(twoDPrinter(Arrays.deepToString()) );
	}

	public static void twoDPrinter (int[][] twoD){

		System.out.println(Arrays.deepToString(twoD));
		
		for(int[] eachArr :  twoD   ) {
			for(int eachNum  : eachArr ) {
				System.out.print(eachNum + " ");
			}System.out.println();
		}
		
		
		 
	}
	
	public static int get2DArray (int row, int col) {
		int[][] getArray = { {1,5,6} , {2,4,9} };
		System.out.println(Arrays.deepToString(getArray));
		
		twoDPrinter(getArray); 
		
		int x=2, y=3;
		int [][]twoDArr= new int [x][y];
		
		for (int i = 0; i < x; i++) {
			System.out.println("row num : "+ i);
			for (int j = 0; j < y; j++) {
				System.out.print("col num : "+ j+ "|");
				
			}System.out.println();
		}
		
		
		
		for (int i = 0; i < getArray.length; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(getArray[i][j] + " ");
			}System.out.println( );
		}
		
		return 0;
	}
}

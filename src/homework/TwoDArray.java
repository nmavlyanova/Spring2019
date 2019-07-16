package homework;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] data = new int[4][2];
	    data[0][0] = 12;
	    data[0][1] = 17;
	    data[1][0] = 3;
	    data[1][1] = 40;
	    data[2][0] = 44;
	    data[2][1] = 27;
	    data[3][0] = 23;
	    data[3][1] = 12;
	    
	    for (int[] rows : data) {
			for (int cell : rows ) {
				
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	
	for (int i = 0; i < data.length; i++) {
		int[] eachRow = data[i];
		//System.out.println(Arrays.toString(eachRow));
		
		for (int j = 0; j < eachRow.length; j++) {
			System.out.print(eachRow[j]);
			
		}System.out.println();
		
	}
	
	
	}
	

}

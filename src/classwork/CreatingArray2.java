package classwork;

import java.util.Arrays;

public class CreatingArray2 {

	public static void main(String[] args) {
		
		int [] cap50= new int[50];
		for (int i = 0; i < cap50.length; i++) {
			cap50[i]=i+1;
		}
		System.out.print(Arrays.toString(cap50));
		System.out.println();
		int [] evenNumber= new int[51];
		for (int j = 0; j <=50; j++) {
			evenNumber[j]=j*2;
		}System.out.println(Arrays.toString(evenNumber));
		
	}

}

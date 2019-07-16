package homework;

import java.util.Arrays;

public class ReversePractice {

	public static void main(String[] args) {
		
		String str ="Sunday Perfect Day to Start Coding";
		// reverse
		
		String[] strArr =str.split(" ");
		
		for (int i = strArr.length-1; i >=0 ; i--) {
			
			
		}
		
		String strRev="";
		int lastIndex=strArr.length-1;
		for (int i = 0; i < strArr.length/2; i++) {
		
			String temp = strArr[i];
			strArr[i]=strArr[lastIndex-i];
			strArr[lastIndex-i]=temp;
			
		}
		System.out.println(Arrays.toString(strArr));
		
		

	}

}

package homework;

import java.util.Scanner;

public class ForEachLoopPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] numb= {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt() };
		int summary=0;
		int max=numb[0];
		int min=numb[0];
		//finding sum
		for( int sum:numb) {
			summary+=sum;
			
		}
		System.out.println("sum is "+summary);
		
		//finding max
		for(int eachNum: numb) {
			if(eachNum>max) {
				max=eachNum;
			}
		}
		System.out.println("max is "+ max);
		
		
		//finding min
		for(int eachNum1:numb) {
			if(eachNum1<min) {
				min=eachNum1;
			}
		}
		System.out.println("min is "+ min);
		
	}

}

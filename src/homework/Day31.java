//WARM UP TASK 
//
//Create few static methods with no return type with below name and logic
//
//1, create a method called countFrom1To10
//take no parameters 
//print 1-10 in one line with space
//
//2, create a method called countFrom1ToN
//take 1 int as parameter  
//print 1-N(number user passed) in one line with space
//
//3, create a method called CountDown
//take 1 int as parameter 
//and count down till 1 in method body



package homework;

import java.util.Scanner;

public class Day31 {
	
	

	public static void main(String[] args) {
		countFrom1To10();
		countFrom1ToN(15);
		countDown(10);

	}
public static void countFrom1To10(){
	//for (int i =1; i<=10; i++)
	//System.out.print(i+ " ");
	//System.out.println();
	int num = 0;
	for (int i = 1; i <=10;  i++) {
		num++;
		System.out.print(num +" ");
	}
	System.out.println();
		
	}
public static void countFrom1ToN(int numb) {
	for (int i = 1; i <=numb; i++) {
		
		System.out.print(i + " ");
			}
	System.out.println();
}
	
//	Scanner scan= new Scanner(System.in);
//	int num = 1;
//	int unknownNum=scan.nextInt();
//	for (int i = 1; i <=unknownNum; i++) {
//		num++;
//		System.out.println(num + " ");
//			}
//	System.out.println();
//}
public static void countDown(int startNum) {
	for (int i = startNum; i >=1; i--) {
		System.out.print(i + " ");
	}System.out.println();
}

}

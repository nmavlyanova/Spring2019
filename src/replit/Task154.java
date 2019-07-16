package replit;

import java.util.Scanner;

public class Task154 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    int firstNum = 0;
	    int secNum = 1;
	    int sum =0;
	    int[] arr=new int[num+1];
	    arr [0]= firstNum;
	    arr [1]=secNum;
	    for (int i = 2; i <arr.length; i++) {
	    	sum =firstNum+secNum;
	    	arr[i]=sum;
	    	firstNum=secNum;
	    	secNum=sum;
	    	
			
			
		}System.out.println(arr[arr.length-1]);
	  }
	}
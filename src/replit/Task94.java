package replit;

import java.util.Scanner;

public class Task94 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
        
        int l = str.length()-1;
        int times = 0;
        for (int i=0; i<=l;i++ ) {
//        if(str.length()<2) {
//        	System.out.println("");
//        }
         if(str.length()>1 &&str.charAt(i)=='h'&&str.charAt(i+1)=='i') {
        	times++;
        	
        }
        }System.out.print(times);
	}

}

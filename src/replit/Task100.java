//You have a green lottery ticket, with ints a, b, c and d on it. 
//If the numbers are all different from each other, the prize is 0. 
//If all of the numbers are the same, the prize is 30. 
//If two of the numbers are the same, the prize is 10. 
//If three of the numbers are the same, the prize is 20.



package replit;

import java.util.Scanner;

public class Task100 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int prize = 0;
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    int d = scan.nextInt();
	    int count1=0, count2=0, count3=0, count4=0;
	    
	    
	    
	    for (int i = 1; i < 5; i++) {
			if(a==b&&b==c&&c==d) {
				count4++;
			}
		}
	}

}

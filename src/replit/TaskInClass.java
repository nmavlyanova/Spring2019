package replit;
import java.util.Scanner;
public class TaskInClass {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
	
		int number = scan.nextInt();
	    int sum = 0;
	    int x = 0;
	    do {
	    	System.out.println(sum);
	    	x++;
			sum+=x;
			if (sum>40) {
				break;
				

	    }
	    }
		
		while (x<=number) ;
	    }
				

	}



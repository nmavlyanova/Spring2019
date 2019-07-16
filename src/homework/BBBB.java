package homework;

import java.util.Scanner;

public class BBBB {

	

		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String model = scan.next();
		    int year = scan.nextInt();
		    boolean recalled = false;

		    
		    if(model.equals("Extravagant")&&(year==2010||year==2011||year==2012)) {
		    	recalled = true;
		    }
		    else if(model.equals("Guzzler")&&(year>=2015||year<=2018)) {
		    	recalled = false;
		    }
		    else recalled = false;
		  System.out.println(recalled);
		  }
}

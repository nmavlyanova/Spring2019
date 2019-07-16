//
//
//
//Write a program, that will read html variable and output attribute value of id attribute (tag) into the console. Input will be provided in a single line as outlined below. If html variable doesn't contain <html> attribute, print out into the console message: "Invalid input!". 
//
//Example: 
//input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
//output: myid




package replit;

import java.util.Scanner;

public class Task90 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    int firstIndex = html.indexOf("id=");
	    int lastIndex = html.lastIndexOf("\"");
	    int htmlIndex = html.indexOf("<html>");
	    
	    if (html.contains("<html>")) {
	    	
	    	System.out.println(html.substring(firstIndex+4, lastIndex));
	    	
	    } else {
	    	System.out.println("Invaliud input");
	    }

	}

}

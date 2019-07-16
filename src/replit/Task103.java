//Print out the number of times that the string "code" appears anywhere in the given string. We'll accept any letter for the 'd', so "cope", "core" and "cooe" count.
//Example:
//input: aaacodebbb
//output: 1
//
//Example:
//input: codexxcode
//output: 2
//
//Example:
//input: cozexxcore
//output: 2



package replit;

import java.util.Scanner;

public class Task103 {

	public static void main(String[] args) {
		int count = 0;
	    Scanner scan = new Scanner(System.in);
	    String  str = scan.nextLine();
	    int l=str.length();
	    for (int i = 0; i < l-3; i++) {
			if(str.substring(i, i+1).equals("c")&&str.substring(i+1, i+2).equals("o")&&str.substring(i+3, i+4).equals("e")){
				count++;
//			}else {
//				count+=0;
			}

	} System.out.println(count);

}}

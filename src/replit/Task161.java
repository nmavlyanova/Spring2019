package replit;
//Instructions from your teacher:
//This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
//
//It returns true only if both a and b are true or c is true.
//
//https://en.wikipedia.org/wiki/Truth_table

public class Task161 {

	public static void main(String[] args) {

		System.out.println(threeLocks(true, true, true));

	}
	 public static boolean threeLocks(boolean a, boolean b, boolean c) {
		    if(a&&b||c==true) {
		    	return true;
		    }else {
		    
		 return false;    
	  }

}}

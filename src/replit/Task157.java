package replit;
//isEven method gets a number(int) if its even (2,4,8...) returns true.
//if its odd return false.
//
//for example:
//
//isEven(1) --> false
//
//isEven(8) --> true
//



public class Task157 {

	public static void main(String[] args) {
		System.out.println(b(8));
		System.out.println(b(9));
	
}
	public static boolean b(int isEven) {
		if (isEven%2==0) {
			return true;
		}
		
		return false;
	}
	
}
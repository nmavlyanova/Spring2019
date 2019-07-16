package day32;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num());
		System.out.println(num());
		long twoYearSal = num()*2;
		System.out.println(twoYearSal);
		
		b(20);
		System.out.println(b(20));
		boolean boo = b(20);
		
		
		giveMeBiggerNumber(3,5);
		System.out.println(giveMeBiggerNumber(15, 69));
		
	}

	public static long num() {
		return 100000l;
		
	}
	
	
	public static boolean b(int num) {
		if (num>18) {
			return true;
			
		} else {
			return false;
			
		}
		
		
	}
	
	
	public static int giveMeBiggerNumber(int b1, int b2) {
//		if(b1>b2) {
//			return b1;
//			} else {
//				return b2;
//			}
	
	int max=(b1>b2) ? b1:b2;
	return max;
	
	}
}

package day62;

public class TryCatchBlock2 {

	public static void main(String[] args) {
		
		
	try {
			
		int [] nums = {1, 5 , 7, 8};
		System.out.println(nums[10]);
		System.out.println("End of TRy block");
		
	} catch(ArrayIndexOutOfBoundsException a) {
			
			System.out.println("You input the wrong Array parameter");
		}
	
	System.out.println("End of the code");
	
	
	
	
	try {
		
		int num1[] = {5,6,8,9,25};
		System.out.println(num1[4]);
		System.out.println("End of Correct Try Block");
		
	} catch(ArrayIndexOutOfBoundsException ai) {
		System.out.println("You input the 2 wrong parameter");
	}
	
	System.out.println("End of The Code");
	}
}

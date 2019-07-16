package day35;

public class MethodWithSameNameDifferentParameters {

	public static void main(String[] args) {
		
		System.out.println("Sum of Two numbers is "+addNums(56,69));
		
		System.out.println("Sum of three numbers is "+addNums(56,69,79));

		addNums(5,10,15,20);
		
	}
	
	public static int addNums(int num1,int num2) {
		int sum = num1+num2;
		
		
		return sum;
	}

	
	public static int addNums(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		return sum;
	}
	
	public static void addNums(int num1, int num2, int num3, int num4) {
		int sum= num1+ num2+ num3+ num4;
		System.out.println(sum);
		
	}
}

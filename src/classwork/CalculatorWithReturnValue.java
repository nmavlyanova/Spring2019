package classwork;

public class CalculatorWithReturnValue {

	public static void main(String[] args) {
		
		
		/*
		 * add two numbers
		 * subtract two numbers
		 * multiply
		 * divide
		 * mod 
		 * 
		 * 
		 * OPTIONAL
		 * calculate method that take 3 parameters
		 * 
		 */

		int totalSum=addition(10,5);
		System.out.println(totalSum);
		
		int totalSubt = subtraction(16,2);
		System.out.println(totalSubt);
		
		int totalMulti =multiplication(5,3);
		System.out.println(totalMulti);
		
		int totalDiv= division(20,10);
		System.out.println(totalDiv);
		
		
		int totalModule =module(21,5);
		System.out.println(totalModule);
		
		
		
		
	}
	
	
	public static int addition(int num1, int num2) {
		int sum=(num1+num2);
		return sum;
	}
	public static int subtraction(int num1, int num2) {
		int subt =(num1-num2);
		return subt;
}
	public static int multiplication(int num1, int num2) {
		int multi =(num1*num2);
		return multi;
	}
	public static int division(int num1, int num2) {
		int divide =(num1/num2);
		return divide;
	}
	public static int module(int num1, int num2) {
		int mod= (num1%num2);
		return mod;
	}
	
}

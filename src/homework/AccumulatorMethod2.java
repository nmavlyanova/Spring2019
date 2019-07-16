package homework;

public class AccumulatorMethod2 {

	public static void main(String[] args) {
		int totalSum=sumToN(5);
		System.out.println(totalSum);
		
	}
	
	public static int sumToN(int n) {
	int sum = 0;
	for (int i = 1; i <=n; i++) {
		sum+=i;
	}
		
	
	 return sum;
}
}

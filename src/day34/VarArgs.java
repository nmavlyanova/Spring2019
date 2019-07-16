package day34;

public class VarArgs {

	public static void main(String[] args) {
		addManyNumbers(new int [] {1,4,6,7,8,9});
		
		
		System.out.println("----VAR ARGS-----");
		addManyNumbers2(1,4,5,6,7,8,9,6);
		addManyNumbers2(1,4,9,6);
		addManyNumbers2(1,4,5,6,6);
		addManyNumbers2(1,4,5,20,56,78,6,7,8,9,7786);
		
	}

	public static void addManyNumbers (int[] manyNums ) {
		
		int sum = 0;
		for( int each  : manyNums) {
			sum+=each;
		}System.out.println(sum);
	}
	
	public static void addManyNumbers2 (int... manyNums) {
		
		int sum = 0;
		for( int each  : manyNums) {
			sum+=each;
		}System.out.println(sum); 
		
	}
	
}

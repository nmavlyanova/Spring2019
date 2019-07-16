package classwork;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int [] nums = {1,33,567,11,22};
		
		for (int i = 0; i < nums.length; i++) {
			
			int eachItem =nums[i];
			System.out.println(eachItem);
			
		}
		// for each loop can only be used for looping through collection type
		for ( int eachItem  :nums ) {
			System.out.println(eachItem);
		}
		
		
		String[] str = {"Cyber", "Tech", "Kleo", "ddddd", "aaaas"};
		for(String eachStr : str) {
			System.out.println(eachStr);
		}
		
		double[] d= {0.2, 0.5, 0.6, 0.9, 2.5};
		for( double eachd : d) {
			System.out.println(eachd);
		}
		
		
		
	}

}

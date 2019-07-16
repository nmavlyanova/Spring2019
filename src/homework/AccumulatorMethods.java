package homework;

public class AccumulatorMethods {

	public static void main(String[] args) {
		String myStars=(getStars(10));
		System.out.println(myStars);
		
		
		int[]nums = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
		for(int n: nums) {
			System.out.println(getStars(n));
		}
	}
	
	

	public static String getStars(int numb) {
		String star="";
		for (int i = 1; i <= numb; i++) {
			 star =star+ "*";
			
		}return star;
	}
	
	
	
	
	
}

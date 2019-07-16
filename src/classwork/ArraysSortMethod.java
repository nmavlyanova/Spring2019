package classwork;

import java.util.Arrays;

public class ArraysSortMethod {

	public static void main(String[] args) {
		
		
		int[] nums= {1,4,5,2,77,45};
		
		System.out.println(Arrays.toString(nums));

		// sort method from Arrays class
		//it take array object and sort it's items in ascending order

		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
	}

}

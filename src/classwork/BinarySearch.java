package classwork;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6,8,9};
		 
		
		
		//ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
		int index = Arrays.binarySearch(nums, 9);
		System.out.println(index);

	}

}

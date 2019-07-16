package homework;

import java.util.Arrays;

public class CountingItemInside {

	public static void main(String[] args) {
		
		
		int[] nums= {1,55,7,898,9,55};
		int count=0;
		System.out.println(Arrays.toString(nums));
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>100) {
				count++;
		}
		}System.out.println(count);

	}

}

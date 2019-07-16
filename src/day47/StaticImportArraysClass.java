package day47;

//static import Arrays.sort method
import static java.util.Arrays.sort;
import static day47.Bike.*;

public class StaticImportArraysClass {

	public static void main(String[] args) {
		
		int[] nums = {1,4,6,8,9,45,0};
		
		sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		showCurrentCount();
		System.out.println(countOfBike);
		
		
		
	}
	
}

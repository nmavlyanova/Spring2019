package classwork;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] nums = new int[2][3];
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		
		nums[1][0]=40;
		nums[1][1]=50;
		nums[1][2]=60;
		
		
		
		
		//reading length from2D array
		//find out how many 1D arrays are in 2D array:
		System.out.println("Number of arrays: "+ nums.length);
		//find out how many items in first array: index 0
		System.out.println("Number of values in first array: "+ nums[0].length );
		System.out.println("Number of values in second array: " + nums[1].length);
		
		int[][]nums2 = { {10,20,30} , {40,50,60} , {70,80}};
		System.out.println(nums2.length);//3
		System.out.println(nums2[0].length);//3
		System.out.println(nums[2].length);//2
		
		
		


	}

}

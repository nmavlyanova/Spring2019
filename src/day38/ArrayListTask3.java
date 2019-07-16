package day38;

import java.util.ArrayList;

public class ArrayListTask3 {

	public static void main(String[] args) {


		/*
		 * Task1:
		 * Create an ArrayList of integer from 1-100
		 * 
		 * get the sum of the each items
		 * get the average
		 * 
		 * Create another list that contain items from 100-1
		 * get the count of numbers divisible by 3 and 5 
		 * 
		 * OPTIONAL
		 * Combine above 2 lists  -- add everything from 2nd list to first one
		 * 
		 * Update every odd items to 0;
		 * 
		 
		 */
		
		ArrayList<Integer> num1to100= new ArrayList<>();
		
		//adding 1-100 to the list
		for(int i=1; i<=100; i++) {
			num1to100.add(i);
		}
		System.out.println(num1to100);
		
		int count =0;
		for(Integer each: num1to100) {
			if(each%3==0 && each%5==0) {
				count++;
			}
			System.out.println("Target count is: "+ count);
		}
		
		
		
		
		
		ArrayList<Integer> num100to1 = new ArrayList<>();
		
		//adding 100-1 to the list
		for(int i=100; i>0; i--) {
			num100to1.add(i);
			
		}
		System.out.println(num100to1);
		
		
		
	}

}

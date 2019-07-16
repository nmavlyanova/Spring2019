package day38;

import java.util.ArrayList;

public class ArrayListTasks {

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
		
		ArrayList<Integer> num1to100= new ArrayList <>();
		
		
		int sum = 0;
		int average=0;
		
		for(int i=1; i<=100; i++) {
			num1to100.add(i);
			
			sum+=num1to100.get(i);
						
		}
		System.out.print(num1to100);
		System.out.println();
		System.out.println("Sum of all numbers: " +sum);
		
		average = sum/num1to100.size();
		System.out.println("The average is: "+average);

	}

}

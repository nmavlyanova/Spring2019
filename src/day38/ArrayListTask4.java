package day38;

import java.util.ArrayList;

public class ArrayListTask4 {

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
		
		ArrayList<Integer> num1to5= new ArrayList <>();
		
		
		for (int i = 1; i < 6; i++) {
			num1to5.add(i);
			}
		System.out.println(num1to5);
		
		
		ArrayList<Integer>num5to1 = new ArrayList<>();
		
		for (int i = 5; i>0; i--) {
			num5to1.add(i);
			
		}System.out.println(num5to1);
		
		
		//addAll method of ArrayList class
		//this will just add every item in num5to1 by the end of num1to5 items
		//num1to5.addAll(num5to1);
		//System.out.println(num1to5);
		
		
		//addAll Method of ArrayList class, second overloaded version
		//this will just insert every item in num5to1
		//to the specified index
		
		num1to5.addAll(1,num5to1);
		System.out.println(num1to5);
		
		
	}

}

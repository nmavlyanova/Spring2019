package day36;

import java.util.ArrayList;

public class ArrayListWithType {

	public static void main(String[] args) {
		
		
		//NO PRIMITIVE TYPES ARE ALLOWED AS TYPE
		
		//ArrayList that store only Integer
		ArrayList<Integer> numList = new ArrayList<>();
		//numList.add("ABC");
		
		Integer i = 100;
		
		//ADDING ITEM
		//We call add method from ArrayList class
		
		numList.add(i);
		numList.add(200);
		numList.add(300);
		System.out.println( numList);
		
		//GETTING SINGLE ITEM FROM ARRAYLIST
		//we call get(index) of ArrayList
		Integer i1 =numList.get(0);
		int  i2 = numList.get(1); // auto unboxing happen here
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println( numList.get(2));
		
		
		

	}

}

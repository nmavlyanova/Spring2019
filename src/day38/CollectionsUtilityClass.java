package day38;

import java.util.*;

public class CollectionsUtilityClass {

	public static void main(String[] args) {


		//Arrays class is a class that have a lot of 
		//static methods to perform common array operation
		//Arrays.sort(arrayObject)
		
		//Collections is a class under java.util package
		//to perform common collection object related operation
		
		ArrayList<String> lst = new ArrayList<>();
		lst.add("Mom");
		lst.add("Dad");
		lst.add("Son");
		lst.add("GrandPa");
		lst.add("GrandMa");
		lst.add("Niece");
		lst.add("Nephew");
		
		System.out.println(lst);
		
		//sorting arrayList using sort method of Collections class
		Collections.sort(lst);
		System.out.println(lst);
		
		//looking for the index of an item in the sorted list
		int grandPaLocation= Collections.binarySearch(lst, "GrandPa");
		System.out.println("GrandPa's index is "+ grandPaLocation);
		
		//reversing collection
		Collections.reverse(lst);
		System.out.println(lst);
		
		//shuffle items inside the list
		Collections.shuffle(lst);
		System.out.println(lst);
	}

}

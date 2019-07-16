package day38;

import java.util.ArrayList;

public class ArrayListTask5 {

	public static void main(String[] args) {
		
		ArrayList<String> lst1 = new ArrayList<>();
		lst1.add("Spiderman");
		lst1.add("Batman");
		lst1.add("Ironman");
		
		ArrayList<String> lst2 = new ArrayList<>();
		lst2.add("Wonder Woman");
		lst2.add("Cyborg");
		lst2.add("Flash");
		
		//lst1.addAll(lst2);
		//System.out.println(lst1);
		
		lst1.addAll(2,lst2);
		
		System.out.println("Justice league : "+ lst1);
		
		
		
		
	}

}

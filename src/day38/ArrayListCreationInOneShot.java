package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreationInOneShot {

	public static void main(String[] args) {

		//Arrays.asList (vararg) can be used to
		//add items while object is being created
		
		//However, 
		//1. The Variable type MUST BE A LIST
		//because the method return List not ArrayList
		//2. It will generate an unmodifiable list 
		//Can not add or remove item 
		//Add or Remove operations are forbidden
		//UPDATE will work by using set
		
		List<Integer> lst= Arrays.asList(3,5,6,7,8,4,3);
		//lst.add(100); WILL NOT WORK
		//lst.remove(0); WILL NOT WORK
		//lst.set(0, 100);  WILL WORK
		System.out.println(lst);

		
		//Since we can not add or remove item from above list
		//we want to copy everything from the list
		//into the new list that we can modify
		
		ArrayList<Integer> myCoolList= new ArrayList<>(lst);
		myCoolList.add(100);
		myCoolList.remove(Integer.valueOf(3));
		System.out.println(myCoolList);
		
		
//		List<String> jla = Arrays.asList("Aybek", "Otabek", "Amirbek");
//		System.out.println(jla);
		
		ArrayList<String> JLA= new ArrayList<>(Arrays.asList("Aybek", "Otabek", "Amirbek"));
		
		JLA.add("Farrukh");
		JLA.add("Nodira");
		JLA.remove("Nodira");
		System.out.println(JLA);
		
		
		
		
		
	}

}

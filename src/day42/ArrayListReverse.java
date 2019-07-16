package day42;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReverse {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(10,60,88,5,80,90));
		System.out.println(lst);
		
		//creating a new list and adding items from the back will work
		ArrayList<Integer> lst2 = new ArrayList<>();
			for(int i=lst.size()-1; i>=0; i--) {
			System.out.println(lst.get(i));
			lst2.add(lst.get(i));
		}
		System.out.println(lst2);

		
		//new requirement --DO NOT CREATE NEW LIST, JUST MODIFY ORIGINAL LIST
		
//		//swap first item with last item
		Integer temp=0;
//		 //storing the first item value in temp
//		lst.set(0, lst.get(lst.size()-1)); //updating first item value to last item value
//		lst.set(lst.size()-1, temp);//updating last item value to original first item value
//		System.out.println(lst);
		
		for (int i = 0; i < lst.size()/2; i++) {
			Integer temp1=lst.get(i);
			lst.set(i, lst.get(lst.size()-(i+1)));
			lst.set(lst.size()-(i+1), temp1);			
		}
		System.out.println(lst);
	}

}

package day42;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1,6,50,80,90));
		
		for(Integer each: lst) {
			each = 100;
			//System.out.println("Item: "+ each);
		}
		
		for(int i=0; i<lst.size(); i++) {
			//copying value of item
			Integer each = lst.get(i);
			//changing the value of copy not original
			each = 100;
			//System.out.println("Item : "+ each);		
		}
		System.out.println(lst);
		
		

	}

}

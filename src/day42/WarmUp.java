package day42;

import java.util.ArrayList;
import java.util.*;

public class WarmUp {

	public static void main(String[] args) {
		
		ArrayList<Integer> ranNumb= new ArrayList<>();
		ranNumb.add(56);  //-->ranNumb.add(new Integer(6)); autoboxing
		ranNumb.add(2);
		ranNumb.add(50);
		ranNumb.add(40);
		ranNumb.add(45);
		System.out.println(ranNumb);
		
		
		
		//Arrays.asList return a fixed size list and return type is List
		//so it has to be stored in List variable
		List<Integer> ranNumb2 = Arrays.asList(56,2,1,56,100);
		
		//creating an ArrayList object with another List object in one shot
		ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1,6,50,80,90));

		
		//updating first item to double of original value
		//getting first item
		//Integer item1= ranNumb.get(0);
		//updating first item
		//ranNumb.set(0, item1*2);
		
		//doing above in one shot
		//ranNumb.set(0, ranNumb.get(0)*2);
		
				for(int i=0; i<ranNumb.size(); i++) {
				ranNumb.set(i, ranNumb.get(i)*2 );
		}
		System.out.println(ranNumb);
		
		Collections.reverse(ranNumb);
		System.out.println(ranNumb);
		
		ArrayList<Integer> temp=new ArrayList<>();
		
		for(int i=0; i<ranNumb.size(); i++) {
//		temp=ranNumb.set(ranNumb.size()-1, element)
			
		}
		
		System.out.println(ranNumb2);
		
		
		
		Collections.reverse(ranNumb2);
		System.out.println(ranNumb2);
		

	}

}

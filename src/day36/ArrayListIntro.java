package day36;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		int i = 10;
		Scanner scan = new Scanner(System.in);
		Double d = new Double ("2.14");
		float f = 1.4f;
		
		//an ArrayList variable lst is created
		//an ArrayList object is created and assigned to lst
		//it did not specify what we can store in this ArrayList
		//so we can store any type
		ArrayList lst = new ArrayList();
		lst.add("abc");
		lst.add("efg");
		lst.add( new Integer(10));
		lst.add( Character.valueOf('A'));
		
		System.out.println( lst);
		
		
		ArrayList<Integer> lst2 = new ArrayList<>();
		

	}

}

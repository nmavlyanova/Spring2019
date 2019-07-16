package day38;

import java.util.ArrayList;

public class ArrayListPackage {

	public static void main(String[] args) {
		

		ArrayList<String>myList= new ArrayList<>();
		
		myList.add("zuccini");
		myList.add("cucumber");
		myList.add("milk");
		myList.add("potato");
		myList.add("tomato");
		myList.add("yogurt");
		myList.add("strawberry");
		myList.add("blackBerry");
		myList.add("grapes");
		myList.add("watermelon");
		myList.add("cabbage");
		System.out.println(myList);
		System.out.println();
		
		
		//count
		System.out.println("Items count in my list: "+ myList.size());
		System.out.println();
		
		
		//getting single item
		System.out.println("Getting single item by index: "+ myList.get(1));
		System.out.println();
		
		
		//update an item
		myList.set(0, "tomato");
		System.out.println("Update an item at index [0] to tomato "+myList);
		System.out.println();
		
		
		//insert an Item
		myList.add(1,"Raspberry");
		System.out.println("Insert a Raspberry to index [1] " +myList);
		System.out.println();
		
		
		//check if an item exists in the list
		boolean haveMilkOrNot=myList.contains("milk");
		System.out.println("Got milk?: "+ haveMilkOrNot);
		System.out.println();
		
		
		System.out.println("Got milk Uppercase "+ myList.contains("Milk"));
		System.out.println();
		
		
		//check the location of certain items
		int indexOfCabbage= myList.indexOf("cabbage");
		System.out.println("Index of cabbage is: "+ indexOfCabbage);
		System.out.println();
		
		
		//remove item using remove
		myList.remove(4);
		System.out.println("Remove an item at index [4] "+myList);
		System.out.println();
		
		myList.remove("strawberry");
		System.out.println("Remove a strawberry from the list" +myList);
		System.out.println();
				
		
		//when using remove(object) version of the method
		//if we don't have an item it will remain the same
		myList.remove("KIWI");
		System.out.println("Should remove a KIWI if it is in the list (if not leave as is): "+ myList);
		System.out.println();
		myList.remove("zuccini");
		System.out.println("Should remove a zuccini from the list" +myList);
		System.out.println();
		
		
		//index has to be within the range or it will throw Exception
		//myList.remove(100);
		//System.out.println(myList);
	
		
		//deleting all from the list
		//myList.clear();
		//System.out.println(myList);
		
		//checking the list is empty or not
		System.out.println("Checking the list is empty or not : "+ myList.isEmpty());
		System.out.println();
		
		
		for(int i = 0; i<myList.size(); i++) {
			System.out.print(myList.get(i)+ "-");
			
		}System.out.println();
		
		for(String each: myList) {
			System.out.print(" | "+ each);
		
		}
	
	
	
	}
	
	
	

}

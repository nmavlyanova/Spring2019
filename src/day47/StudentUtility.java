package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentUtility {

	private static ArrayList<String>studentList;
	
	static {
		System.out.println("Welcome to Student Utility");
		}

	static {
		
		loadAllMyData();
		
		System.out.println("All Students has been loaded");
	}
	
	
	public static void displayAllStudent() {
		for (int i = 0; i <studentList.size() ; i++) {
			System.out.println("No: "+(i+1)+ ". "+studentList.get(i));
		}
	}
	
	public static void addOneStudent(String name) {
		studentList.add(name);
	}
	
	public static void updateStudent(int index, String newName) {
		if( index>= studentList.size() ) {
			System.out.println("OUT OF RANGE");
			return;//use return to get out of the method
		}
		studentList.set(index, newName);
	}
	
	public static void removeStudent(int index) {
		if( index>= studentList.size() ) {
			System.out.println("OUT OF RANGE");
			return;//use return to get out of the method
		}		
		studentList.remove(index);
	}
	
	public static void resetTheList() {
		studentList.clear();
	}
	
	private static void loadAllMyData() {

		studentList = new ArrayList<>();
		studentList.add("NN");
		studentList.add("BB");
		studentList.add("CC");
		studentList.add("DD");
		studentList.add("EE");
		studentList.add("FF");
		studentList.add("GG");
		studentList.add("HH");
		studentList.add("JJ");
		studentList.add("KK");
	}
	
	
	
//	
//	public static void main(String[] args) {
//		System.out.println(studentList);
//		displayAllStudent();
//		
//		System.out.println("------");
//		addOneStudent("LLLL");
//		displayAllStudent();
//		
//		System.out.println("------");
//		updateStudent(8, "CHCHCH");
//		displayAllStudent();
//		
//		System.out.println("--------");
//		removeStudent(5);
//		displayAllStudent();
//
//		System.out.println("----------");
//		resetTheList();
//		displayAllStudent();
//		System.out.println("All cleared");
//		
//	
//	}
}

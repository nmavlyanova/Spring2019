package day42;

import java.util.ArrayList;

public class CopyingAVariableValue {

	public static void main(String[] args) {

	Dog puppy = new Dog();
	puppy.name = "Belka";	
	puppy.breed = "German shepperd";
	
	Dog d1 = puppy;
	d1.name="Strelka";
	System.out.println(puppy.name);

	String str1 = new String();
	str1 = "AAA";
	String str2 = str1;
	str2 = "BBB";
	System.out.println(str1);
	
	}

}

package replit;

import java.util.Arrays;

//Complete the combineNames method to return a new String array that is composed of the first name and last name of each of the parameters.
//
//This may be confusing so look at the example:
//first_names = {"bob","joe"}
//last_names = {"jones","smith"}
//
//returns a new String array with {"bob jones", "joe smith"}

public class Asses8_2 {

	public static String[] combineNames(String[] first_names, String[] last_names)
	{
		String combine ="";
		for (int i = 0; i < first_names.length; i++) {
			combine+=first_names[i];
			for (int j = 0; j < last_names.length; j++) {
				combine+=last_names[i];
			}
		}
		return Arrays.toString(combine);
	}
	
}

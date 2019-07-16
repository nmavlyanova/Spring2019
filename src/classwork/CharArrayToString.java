package classwork;

import java.util.Arrays;

public class CharArrayToString {

	public static void main(String[] args) {
		
		String name = "Nodira Farrukh";
		char[] newName = name.toCharArray();
		
		System.out.println(Arrays.toString(newName));
		
		String name2= "";

//		for (int i = 0; i < newName.length; i++) {
//			char c = newName[i];
//			name2+=c;
//			System.out.println(name2);
//		
		
		String name3 =new String (newName);
		System.out.println(name3);
				

	}

}

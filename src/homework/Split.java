package homework;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String grocerie= "potato, onion,tomato,milk,bread";
		String[] splitGrocerie= grocerie.split(",");
		System.out.println(Arrays.toString(splitGrocerie));
		System.out.println(splitGrocerie.length);// find the size of split
		System.out.println(splitGrocerie[1]);
		System.out.println(splitGrocerie[splitGrocerie.length-1]);
		
		
		//for (int i = 0; i < splitGrocerie.length; i++) {
			//System.out.println(splitGrocerie[i].trim().length());
			//System.out.println(splitGrocerie[i]);
		//}
		
		
		
		

	}

}

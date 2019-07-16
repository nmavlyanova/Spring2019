package classwork;

import java.util.Arrays;

public class MethodThatTakesArrayAsParameter {
	

	public static void main(String[] args) {
		/*methods:
		*reusable code, maintainable code, write once and use it whenever needed
		*
		*3 questions to ask while creating a method:
		* does this method needs an object or not when being called
		*    --->>if not we use static keyword
		* does this method take external data or not
		*    --->> if it doesn't we just end method name with empty()
		*    --->> if yes put data type and name: parameters separeted by comma
		* does this method return a value after being called
		*    --->> if not used void
		*    --->> if yes put the data type of the variable it return
		*          
		*    
		*/
		
		String s = "abc";
		System.out.println( s.charAt(0));
		
		int[] arrObject = {1,2,5,6};
		
		//Arrays.sort(arrObject);
		arrayPrintWithDash(arrObject);
		
		reportBiggerArray(new int[] {1,}, new int[] {1,6});
		
				
	}
public static void arrayPrintWithDash(int[] manyItems) {
	for (int each:manyItems) {
		System.out.print(each+ "-");
	}
	System.out.println();
}
	

public static void reportBiggerArray(int[]arr1, int[]arr2 ) {
	if(arr1.length>arr2.length) {
		System.out.println(Arrays.toString(arr1));
		
	} else {
		System.out.println(Arrays.toString(arr2));
		
	}
}
	
	
}

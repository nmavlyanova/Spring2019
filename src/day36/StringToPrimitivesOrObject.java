package day36;

public class StringToPrimitivesOrObject {

	public static void main(String[] args) {


		
		/*
		 * From String to Primitives
		 *  X.parseX method will take String
		 *  and return  --> primitive value
		 *  
		 */
		String str1= "True";
		boolean b1 = Boolean.parseBoolean(str1);
		boolean b2 = Boolean.parseBoolean("ABC");
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		/*
		 * From String To Wrapper Class Object
		 * valueOf method will take String 
		 * and return --> Wrapper Class object
		 */
		String d = "3.14";
		Double db1 = Double.valueOf(d);
		
		System.out.println(db1);
		
		double d2 = db1; //-->auto unboxing
		
		
		
		//Invalid conversion
		//System.out.println( Double.parseDouble("3.14abc"));
		//System.out.println( Integer.valueOf("3.14"));
		
		
		
	}

}

package day35;

public class MethodOverloadingExamples {

	public static void main(String[] args) {
		String name = "Java";
		System.out.println(name.indexOf("a"));
		System.out.println(name.indexOf("a",2));
		
		System.out.println( name.replace('a', 'b'));
		System.out.println( name.replace("KK", "KK"));
		
		
		

	}

}

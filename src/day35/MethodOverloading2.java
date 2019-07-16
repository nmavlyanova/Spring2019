package day35;

public class MethodOverloading2 {

	public static void main(String[] args) {
		
		//Any literal non-fractional numbers will be seen as int
		//Any literal fractional numbers will be seen as double 

		int i = 10;
		add(i);
		
		//add(10L);
		add( (int)10L );
		
		

	}
	//this method can take any argument of type int
	//or anything that can be stored inside int variable
	//for example short and bytes are allowed
	//but not long or double

	public static void add(int x) {
		System.out.println(" int x "+x);
	}
	
	public static void add(long x) {
		System.out.println(" long x "+x);
	}
}

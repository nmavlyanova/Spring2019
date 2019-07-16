package day35;

public class MethodOverloading {

	public static void main(String[] args) {
		
		printName();
		printName("Aybek");
		printName("Otabek","Mavlonov");
		printName(356);
		
		
	}

	public static void printName() {
		System.out.println("No arg print name");
	}
	
	public static void printName(String name) {
		System.out.println("1 String arg print name "+ name);
	}
	
	public static void printName(int number) {
		System.out.println("1 intg arg print number "+ number);
	}
	
	public static void printName(String firstName, String lastName) {
		System.out.println("2 String args print names "+ firstName+ " "+ lastName);
	}
}

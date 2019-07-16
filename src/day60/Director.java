package day60;

public class Director extends Manager {

	int stockOption = 50000 ;
	
	
	
	public static void main(String[] args) {
		
		Director d1 = new Director();
		System.out.println(d1.budget);
		System.out.println(d1.salary);
		System.out.println(d1.stockOption);
		
		Manager m1 = new Director();
		System.out.println(m1.budget);
		System.out.println(m1.salary);
		
		
		
		// How to access Director's stock option
		// In order to access Director's specific field we need to refer Director as a Director
		
		Employee e1 = new Director(); // UPCASTING
		System.out.println(e1.salary);

		Director d = (Director) e1;
		System.out.println(d.stockOption);
	
	
	}
}

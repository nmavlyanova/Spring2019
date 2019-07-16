package classwork;

public class MethodWithParameters {

	public static void reportName(String firstName, String lastName) {
		System.out.println("The length of first name " + firstName + " is " + firstName.length() + 
				". The length of last name " + lastName + " is " + lastName.length());
		System.out.println("Your initials are "+ firstName.charAt(0)+lastName.charAt(0));
				
		
		
	}
	public static void main(String[] args) {
		reportName("Nodira","Mavlyanova");

	}

}

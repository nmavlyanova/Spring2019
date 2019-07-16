package homework;

public abstract class MethodTest {

	public static void main(String[] args) {
		
		String newEmail = getEmail("nodira","mavlyanova");
		System.out.println(newEmail);
	//System.out.println(getEmail("nodira","mavlyanova"));

	}

	
	public static String getEmail(String firstName, String lastName) {
		//String email = firstName + "_"+ lastName+ "@gmail.com";
		String email = firstName.toLowerCase() + "_"+ lastName.toLowerCase()+ "@gmail.com";
		
		return email;
	}
	
	
}


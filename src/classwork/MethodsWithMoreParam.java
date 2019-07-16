package classwork;

import java.util.Scanner;

public class MethodsWithMoreParam {

	public static void login(String user, String password, boolean rememberMe) {
		
		System.out.println("You entered username : "+ user);
		System.out.println("You entered password : "+ password);
	if(rememberMe==true) {
			System.out.println("You checked remember me inbox");			
		}
		else {
			System.out.println("You did not check the inbox");
		}
	}
	
	
	
	public static void main(String[] args) {
		login("cat", "dog", true);
		

	}

}

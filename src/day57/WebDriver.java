package day57;

import java.util.ArrayList;

// everything in interface:
// automaticalyy public if not defined

public interface WebDriver {

	public static final String PURPOSE = "Automating Browser";

	public abstract void openBrowser();
	public abstract void navigatTo(String URL);
	public abstract void quit();
	String findElementsByID(int id);
	ArrayList<String> findElementsByTagName(String tagName);
	
	// DEFAULT METHOD
	// IT IS DEFINED USING DEFAULT KEYWORD
	// AND IT HAS BODY
	// WE CAN INHERIT IT AS IS
	// or we can override to provide actual implementation
	
	public default void clickButton(String name) {
		System.out.println("Do your implementation without breaking");
	}

	public default void clickButtonAndEnterTEXT(String name) {
		//clickButton("MY BLUE BUTTON");
		System.out.println(" clickButtonAndEnterTEXT Do your implementation without breaking");
		quit();
	}
	
	
	
	// STATIC METHOD OF INTERFACE IS NOT INHERITED
	public static void showPurpose() {
		System.out.println("purpose is "+ PURPOSE);
	}
}

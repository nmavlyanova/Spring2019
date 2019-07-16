package day57;

import java.util.ArrayList;

public class ChromeDriver implements WebDriver {
	
	int screenSize;
	double positionX;
	
	// any time I create a Chromedriver Object
	// it should automatically open the browser

	public ChromeDriver(int screenSize, double positionX) {
		
		this.screenSize = screenSize;
		this.positionX = positionX;
		openBrowser();
	}
	
	public ChromeDriver() {
		System.out.println("Creating ChromeDriver with no arg");
		openBrowser();
	}

	@Override
	public void openBrowser() {
		System.out.println("Open ChromeDriver Browser");
		
	}

	@Override
	public void navigatTo(String URL) {
		System.out.println("Navigate ChromeBrowser to URL "+ URL);
		
	}

	@Override
	public void quit() {
		System.out.println("Closing the ChromeBrowser");
		
	}

	@Override
	public String findElementsByID(int id) {
		System.out.println("Looking for element with id : "+ id);
		return "my element";
	}

	@Override
	public ArrayList<String> findElementsByTagName(String tagName) {
		System.out.println("Looking for all elements with tag name "+ tagName);
		ArrayList<String> allElements = new ArrayList<String>();
		allElements.add("first checkbox");
		allElements.add("another textbox");
		allElements.add("sign up link");
		return allElements;
	}
	
	@Override
	public void clickButton(String name) {
		clickButtonAndEnterTEXT("abc");
		System.out.println("Clicking Button "+ name);
	}

	
	
	public static void main(String[] args) {
		
		ChromeDriver Cdr= new ChromeDriver(25, 2.5);
		Cdr.quit();
		
		ChromeDriver Cdr1 = new ChromeDriver();
		Cdr1.navigatTo("www.Cybertek.com");
		Cdr1.findElementsByID(100);
		Cdr1.findElementsByTagName("Check point");
		
		ArrayList<String> allElm = Cdr.findElementsByTagName("/p");
		System.out.println(allElm);
		
		
		Cdr1.clickButton("abc");
		Cdr1.clickButtonAndEnterTEXT("Cybertek");
		
		
		WebDriver.showPurpose();
		 
	}
	
	
}

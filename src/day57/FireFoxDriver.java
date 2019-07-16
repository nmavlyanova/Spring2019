package day57;

import java.util.ArrayList;

public class FireFoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Open FireFoxDriver Browser");
		
	}

	@Override
	public void navigatTo(String URL) {
		System.out.println("Navigate FirefoxDriver to URL "+ URL);
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findElementsByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> findElementsByTagName(String tagName) {
		// TODO Auto-generated method stub
		return null;
	}

}

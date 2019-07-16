package day59;

import day57.ChromeDriver;
import day57.FireFoxDriver;
import day57.WebDriver;
import day58.*;

public class AnimalShow59_1 {

	public static void main(String[] args) {
		
		Animal myAnimal = new Dog();
		myAnimal.makeNoise();
		
		myAnimal = new Cat();
		myAnimal.makeNoise();
		
		myAnimal = new Horse();
		myAnimal.makeNoise();
		
		// this is creating object
		// without storing the address of the object
		// and just using it once - like calling method as below
		
		// this object is not accessible after this line
		// because we did not write down the address
		new Dog().makeNoise();
		
		
		
		
		// WebDriver is an interface that we created 
		// ChromeDriver is a class that implement WebDriver
		
		WebDriver driver = new ChromeDriver();
		driver.navigatTo("www.Cyber.com");
		
		// FireFoxDriver is a class that implement WebDriver
		
		driver = new FireFoxDriver();
		driver.navigatTo("google");
		
	}
}

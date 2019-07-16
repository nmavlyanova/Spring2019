package homework;
import java.util.Scanner;
public class BookExercises {
	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
String color, food, animal, firstName;
System.out.println("Please enter your favorite color:");
color = keyboard.next();

System.out.println("Please enter your favorite food:");
food = keyboard.next();

System.out.println("Please enter your favorite animal:");	
animal = keyboard.next();

System.out.println("Please enter your a first name of your friend or relative:");	
firstName= keyboard.next();	
	String sentence = "I had a dream that Name ate a Color Animal \n and said it tasted like Food! ";
    sentence = sentence.replace("Name", firstName);
	sentence = sentence.replace("Color", color );
	sentence = sentence.replace("Animal", animal);
	sentence = sentence.replace("Food", food);
	System.out.println(sentence);
	
	}
}

package homework;
import java.util.Scanner;
public class ChangingAndReplacingInString 
{
	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a line of text. No punctuation please.");
String simpleSent = keyboard.nextLine();
int space = simpleSent.indexOf(" ");

String firstWord = simpleSent.substring(0, space + 1);
String removeWord = simpleSent.replaceFirst(firstWord, "");
String letterCap = removeWord.substring(0,1).toUpperCase();
System.out.println("I have rephrased that line to read:");
System.out.println("");
System.out.println(letterCap+ removeWord.substring(1) + " " + firstWord.toLowerCase());
 
	}
}

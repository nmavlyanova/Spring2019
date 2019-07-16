package replit;

//Write a method header on line two with the following specs:  
//
//Returns: a String
//Name: makeThreeSubstr
//Parameters:
//a String called "word"
//an integer called "startIndex"
//an integer called "endIndex"
//
//Then, starting on line 4, write code that will return 3x the substring (no spaces) from "startIndex" to "endIndex"
//
//Examples:
//makeThreeSubstr("hello",0,2) ==> "hehehe"
//makeThreeSubstr("shenanigans",3,7) ==> "naninaninani"

public class Asses7_1 {
	public static String makeThreeSubstr(String word, int startIndex, int endIndex)
{
	String s = word.substring(startIndex, endIndex);	
	return s+s+s;}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}

}

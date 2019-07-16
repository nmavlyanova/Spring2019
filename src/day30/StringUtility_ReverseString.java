package day30;

public class StringUtility_ReverseString {
	
	public static void reverseString(String str) {
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
	}

	public static void main(String[] args) {
reverseString("MadamTusso");
reverseString("Bolala");

	}

}

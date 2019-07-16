package day34;

public class WarmUpIsPalindromString {
	
	public static boolean isPalindrome(String str) {
		str=str.replaceAll(" ","");
		String reversedString= "";
		boolean check=false;
		for (int i = str.length()-1; i>=0; i--) {
			reversedString +=str.charAt(i);
			if(str.equals(reversedString)) {
			check=true;
				
			}else {check=false;
		}}
		return check;
		
		
	}

	public static void main(String[] args) {
		boolean checkPalindrome=isPalindrome("level");
		System.out.println(checkPalindrome);
		
		
	}

}

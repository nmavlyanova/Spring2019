package day33;

public class WarmUpOptional {

	public static void main(String[] args) {
		System.out.println(firstCharOfFirstWordAndLastWord("Love Java"));		

	}
	
	
	public static String firstCharOfFirstWordAndLastWord(String sentence) {
		char firstChar = sentence.charAt(0);
		String[]allWords = sentence.split(" ");
		String lastWord = allWords[allWords.length-1];
		String finalWord = firstChar+ lastWord.substring(1);
		return finalWord;
	}

}

package day35;

public class WarnUp {

	public static void main(String[] args) {
		String[] words = new String[]{"abc", "bbbb","sdatdhfj"};
		System.out.println(findLongestWord(words));

	}
	
	public static String findLongestWord(String... word ) {
		
		String longest = word[0];
//		for (int i = 0; i < words.length; i++) {
//			
//			if(words[i].length()>longest.length()) {
//				longest=words[i];
//				
//			} return longest;
//		}
		
//		for(String str: word) {
//			if(str.length()>longest.length()) {
//				longest=str;
//				 
//			}
//		} return longest;
//		
//	}
	 for( String names :word) {
		 if(names.length()>longest.length()) {
			 longest=names;
		 }
	 }return longest;
	 

}}

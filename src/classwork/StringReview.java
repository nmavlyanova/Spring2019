package classwork;

public class StringReview {

	public static void main(String[] args) {
		String str ="Name: Ba Ba Black Ba";
    // getting the inddex of word String
//		System.out.println(str.indexOf("String"));
		String target = "Ba";
		int indexOf1Ba = str.indexOf("Ba");
		System.out.println(indexOf1Ba);
		
		int indexOf2Ba = str.indexOf("Ba", indexOf1Ba+2);
		System.out.println(indexOf2Ba);
		
		int indexOf3Ba = str.indexOf("Ba", indexOf2Ba+2);
		System.out.println(indexOf3Ba);
		
		
	}

}

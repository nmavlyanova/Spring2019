package classwork;

public class SubStringWithLoop {

	public static void main(String[] args) {
		String str = "ABCDEFG";
		for(int i = 0; i<str.length(); i+=2) {
			if (i!=str.length()-1) {			
			System.out.println( str.substring(i, i+2) + " ");
		}else {
			System.out.println(str.substring(i));
		}

	}
	}
}

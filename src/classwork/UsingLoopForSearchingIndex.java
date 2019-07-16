package classwork;

public class UsingLoopForSearchingIndex {

	public static void main(String[] args) {

		String str = "ABCAADDKAB";
		int l= str.length()-1;
		
		for(int i =0; i<l; i++) {
//			System.out.print(str.charAt(i) + " - ");
			String eachchar = str.substring(i, i+1);
			
			if(i!=str.length()-1) {
					System.out.print(eachchar +" - ");
		}else {
			System.out.println(eachchar);
//			System.out.println(eachchar + ( (i!= str.length()-1)? "-" : ""));
		}
			
	}

}}

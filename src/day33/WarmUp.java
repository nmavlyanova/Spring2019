package day33;

public class WarmUp {

	public static void main(String[] args) {
		
		System.out.println(getSum(new int[] {1,5,16,4}));
		
		System.out.println( addAll( new String[] {"kaka","laka", "waka"}));
		
		System.out.println(getMax(new int [] {5, 7, 8, 9}));
		

	}
	
	
	public static int getSum (int [] num) {
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			 sum=sum+num[i];
			 }
		return sum;
	}
	
	public static String addAll(String[] str) {
		String newStr = "";
		for (int i = 0; i < str.length; i++) {
			newStr+=str[i];
		}
		return newStr;
	}
	public static int getMax(int [] numLine) {
		int max=numLine[0];		
		for (int i = 0; i < numLine.length; i++) {
			if(max<numLine[i]) {
				max=numLine[i];
				
		}
		}return max;
	}

}

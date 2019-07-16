package homework;

public class FindingMax {

	public static void main(String[] args) {
		int [] num = new int [] {1,4,6,8,9};
		int max = num[0];
		
		
		
		for (int i = 1; i < num.length; i++) {
			if (num[i]>max) {
				max=num[i];
			}
		}System.out.println(max);
}
	


	}


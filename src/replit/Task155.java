package replit;

public class Task155 {

	public static void main(String[] args) {
		System.out.println(counts(new String[] {"java","lava", "java"}, "java"));
		System.out.println(counts(new String[] {"ava","lava", "kava"}, "java"));
	}
	public static int counts(String[] arr, String str) {
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(str)) {
				count++;
			}
		} return count;
	}

}

package homework;

public class MultiplicationBar {

	public static void main(String[] args) {

		int product=0;
		System.out.println("_____________");
		for (int outer = 1; outer<=2; outer++) {
			for (int inner = 1; inner <=10; inner++) {
				product=outer*inner;
				System.out.println("|           |");
				System.out.println(outer+ "*"+ inner + "=" + product);
		}
		}System.out.println("_____________");

	}

}

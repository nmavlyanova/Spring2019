package classwork;

public class ForLoopContinue {

	public static void main(String[] args) {
		
		
//		2.1
// for (int i = 1; i<=50; i+=2) {
//	 System.out.print(i + " ");
// }
		
		
		
		
////		2.2
//// for (int i = 0; i<=50; i++) {
////	 if (i%4==0) {
////		 System.out.print(i + " ");
////	 }
// }
		
		
		
		int count= 0;
		for (int i = 0; i<=50; i++) {
			if (!(i%3==0)&&!(i%5==0)) {
				System.out.print(i+ " ");
				count+=i;
			}
		}System.out.println(count);
	}

}

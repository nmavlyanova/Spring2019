package day52;

public class Tiger extends Animals {

	public void Test() {
		System.out.println(protectedStr);
		
		Animals obj = new Animals();
		
		Tiger obj2 = new Tiger();
		System.out.println(obj2.protectedStr);
	}

}

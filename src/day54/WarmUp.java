package day54;

public class WarmUp {

	int num = 100;
		//num =200;
	//System.out.println("a statement); // we can not write a statement in the field
										// statement should be in the block
		
	
	{
		num = 150;
	}
	
	public WarmUp() {
		num = 200;
	}
	
	public WarmUp(int x) {
		num = 400;
	}
	
	public static void main(String[] args) {
		
		WarmUp w = new WarmUp();
		System.out.println(w.num);
		
	}
	
	
	
}

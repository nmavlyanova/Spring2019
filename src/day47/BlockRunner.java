package day47;

public class BlockRunner {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		InstanceBlock block1 = new InstanceBlock();
		System.out.println("--------"+ block1.num);
		
		InstanceBlock block2 = new InstanceBlock("John Snow");
		System.out.println("--------" + block2.num);
		
	}

}

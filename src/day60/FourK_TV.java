package day60;

public class FourK_TV extends TV {

	int channelCount = 200;
	
	@Override
	public void play() {
		System.out.println("Playing 4K_TV");
	}
	
	@Override
	public int getChannelCount() {
		System.out.println("Channel Count in 4K_TV");
		return  channelCount;
	}

	
	// this is how compiler see the inherited method
	// if no change is made to the method, thus method has not been Overridden
	// you have this method with body that calls super class
	// and you will get all super class's values

//	@Override
//	public int getChannelCount() {		
//		return super.getChannelCount();
//	}
	
	public static void doTvStatic() {
		System.out.println("do 4K_TVSatic");
	}

	
	
	public static void main(String[] args) {
		
		TV tv1 = new FourK_TV();
		System.out.println(tv1.channelCount);
		tv1.play();
		System.out.println(tv1.getChannelCount());
		tv1.doTvStatic();
	}
	
}

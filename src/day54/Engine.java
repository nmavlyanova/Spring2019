package day54;

public class Engine {

	final String engineType ;
	final int cylinderCount;
	
	public Engine(String engineType, int cylinderCount) {
		this.engineType = engineType;
		this.cylinderCount = cylinderCount;
	}
	
	public void start() {
		System.out.println("Engine  < "+ engineType +
							" >  with cylinder count  < "+ 
							cylinderCount +" >  is starting");
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", countCylinder=" + cylinderCount + "]";
	}
	
	
	
}

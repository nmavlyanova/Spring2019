package day54;

public class SuperCar {

	final String model;
	final Engine engine;


	public SuperCar(String model, Engine engine) {
		
		this.model = model;
		this.engine = engine;
	}
	
	public void start() {
		engine.start();
		System.out.println("Super Car  < "+ model+" > with  < "+ 
							engine.cylinderCount + " >  is starting");
	}

	@Override
	public String toString() {
		return "SuperCar [model=" + model + ", engine=" + engine + "]";
	}
	
	
	
}

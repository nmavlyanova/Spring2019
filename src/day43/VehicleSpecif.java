package day43;

public class VehicleSpecif {

	public static void main(String[] args) {
		
		Vehicle honda= new Vehicle();
		honda.setModel("Accord");
		honda.setMake("Honda");
		honda.setSpeed(55);
		System.out.println(honda.getMake());
		System.out.println(honda.getModel());
		honda.increaseSpeed(12);
		honda.decreaseSpeed(2);
		System.out.println("-----------------");
		
		
		Vehicle toyota = new Vehicle();
		toyota.setModel("Camry");
		toyota.setMake("Toyota");
		System.out.println(toyota.getMake());
		System.out.println(toyota.getModel());
		toyota.setSpeed(45);
		toyota.increaseSpeed(20);
		toyota.decreaseSpeed(3);
		System.out.println("----------------");
		
		
		Vehicle nissan = new Vehicle();
		nissan.setModel("Maxima");
		nissan.setMake("Nissan");
		nissan.setSpeed(65);
		System.out.println(nissan.getMake());
		System.out.println(nissan.getModel());
		nissan.increaseSpeed(3);
		System.out.println("---------------");
		

	}

}

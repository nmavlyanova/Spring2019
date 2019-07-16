package day58;

public class Cat extends Animal implements IndoorPet {

	public String legCount ="cat leg";
	@Override
	public void makeNoise() {
		System.out.println("MEAW MEAW");
	}
}

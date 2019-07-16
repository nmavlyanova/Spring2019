package day32;

public class Converter {

	public static void main(String[] args) {
		System.out.println(meterToCm(3));
		
		System.out.println(feetToInch(6));
		System.out.println(FaToCelsius(32));

	}
	public static int meterToCm(int meter) {
		return  meter*100;
	}
	public static double feetToInch(int feet) {
		return  feet*12;
	}
	public static double FaToCelsius( double fahr) {
		return (fahr-32)*5/9;
	}
	
}

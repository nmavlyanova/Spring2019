package homework;

public class ConverterUtility {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double myKm= mile2Km(55);
		System.out.println(myKm);
		if(mile2Km(55 )<100) {
			System.out.println("Your speed is good");
		}else {
			System.out.println("reduce your speed");
		}
		
		
		int myCelcius = fahrenheitToCelcius(87);
		System.out.println(myCelcius);
		
	}

	public static double mile2Km(double miles) {
		double km = miles/0.621371;
		return km;
	}
	public static int fahrenheitToCelcius(int fahrenheit) {
		int celcius = (fahrenheit-32) * 5/9 ;
		return celcius;
	}
}

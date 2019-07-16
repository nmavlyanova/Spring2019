package day40;

public class PhoneFactory {

	public static void main(String[] args) {
		
	
			
			Phone iPhone = new Phone();
			iPhone.type = "I6";
			iPhone.OS = "iOS";
			iPhone.capacity=64;
			iPhone.ring();
			iPhone.dial(9985632156l);
			iPhone.displayPhoneInfo();
			System.out.println("Phone type: " + iPhone.type+ ", Operating System: "+ iPhone.OS+ ", Capacity: "+ iPhone.capacity);
	
			
			Phone samsung = new Phone();
			samsung.type = "S8";
			samsung.OS = "android 9.0";
			samsung.capacity = 64;
			samsung.ring();
			samsung.dial(9985632156l);
			samsung.displayPhoneInfo();
			System.out.println("Phone type: " + samsung.type+ ", Operating System: "+ samsung.OS+ ", Capacity: "+samsung.capacity);
			
			
			Phone pixel = new Phone();
			pixel.type = "XL";
			pixel.OS = "android 9.0";
			pixel.capacity = 32;
			pixel.ring();
			pixel.dial(9985632156l);
			pixel.displayPhoneInfo();
			
			
			
		}

}

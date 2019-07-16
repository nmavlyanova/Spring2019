package paymentsManager;

import java.util.ArrayList;
import java.util.List;

import beans.*;
import beans.Mastercard;
import beans.Payment;
import beans.Visa;

public class paymentController {
	
	List<Payment> payments = new ArrayList<>();
	
	
//	1/22/09 9:28, Product1,	1200,	Mastercard,	Cardina,	Astoria,	England,	United Kingdom
	public void addPaymentRecord(String data) {
		
		//check if payment data is empty
		if(data.isEmpty()) {
			System.out.println("Exeption: Empty Data Passed");
			return;
		}
		
		//split by comma since data is coming from CSV
		//I am sure there is ready library for this
		String[] dataArray = data.split(",");
		
		//check for missing fields
		if(dataArray.length !=8) {
			System.out.println("Exeption: Some Data is Missing");
			return;
		}
		
		
		Payment tempPayment = null;
		
		switch(dataArray[3].trim()) {
			case "Visa":
				tempPayment = new Visa();
				break;
			case "Mastercard":
				tempPayment = new Mastercard();
				break;
			case "Amex":
				tempPayment = new Amex();
				break;
			case "Diners":
				tempPayment = new Diners();
				break;
			default:
				System.out.println("Exception: invalid payment - "+ dataArray[3].trim());
				return;
		}
		
//		1/2/2009   1:08:00 PM
		tempPayment.setTransactionDate(parseDate(dataArray[0]) );
		tempPayment.setProduct(new Product(dataArray[1].trim() ));
		tempPayment.setPrice(Double.parseDouble(dataArray[2].trim() ));
		tempPayment.setName(dataArray[4].trim() );
		tempPayment.setLocation(new Location(dataArray[5].trim(), dataArray[6].trim(), dataArray[7].trim() ));
		
		payments.add(tempPayment);
		
	}

	
	
	
	private MyDate parseDate(String str) {
		String[] arr = str.split("/");
		arr[2] = arr[2].substring(0, 2);
		
		return new MyDate(Integer.parseInt(arr[0]),
						 Integer.parseInt(arr[1]),
						 Integer.parseInt("20"+arr[2]) );
	}
}

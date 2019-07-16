package paymentsManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import beans.Location;
import beans.MyDate;
import beans.Payment;
import beans.Product;
import beans.Visa;

public class Main {

	public static void main(String[] args) throws IOException {
		Payment payment1 = new Visa();
		
// 1/23/09 9:55	Product1	1200	Visa	Janet	Martin	OR	United States
	payment1.setTransactionDate(new MyDate(1, 23, 2009));
	payment1.setProduct(new Product("Product1"));
	payment1.setPrice(1200);
	payment1.setName("Janet");
	payment1.setLocation(new Location("Martin", "OR", "United States"));

	//toString method
	//System.out.println(payment1.toString());

	paymentController paymentController = new paymentController();
	paymentController.addPaymentRecord("");
	
	//System.out.println(paymentController.payments.get(0).toString());
	//Read Data from CSV file
	BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\Silk Road\\Desktop\\Sales_2009.csv"));
	System.out.println(br.readLine());
	System.out.println(br.readLine());
	System.out.println(br.readLine());
	
	
		
		
	}
}

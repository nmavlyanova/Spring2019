package day43;

public class ProductExplorer {

	public static void main(String[] args) {


		Product p1 = new Product();
		//p1.name = "somethng";
		p1.setAllValue("Watch", 4.5f, 113.39, "*123");
		
		System.out.println(p1.getName());
		System.out.println(p1.getRating());
		System.out.println(p1.getPrice());
		System.out.println(p1.getProductID());
		
		// $20 sale is ongoing, change the value of price
		p1.setPrice(113.39-20);
	
		String productInfo = "Bag, 4.9, 399.99, gucci12";
		//take the String and turn it into Product Object
		
		productInfo.split(", ");
		System.out.println(productInfo);
		
		
		
	}

}

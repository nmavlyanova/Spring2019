package homework;

import java.util.Arrays;

public class CarsMultiDArray {

	public static void main(String[] args) {
		
		String[][] cars = new String[][]{{"Honda", "Toyota", "Infinity", "Acura"},
										{"Meercedes", "BMW", "Audi"},
										{"Jeep", "GMC", "Lincoln"},
										{"Reno"}};
		
						
	 for (int i = 0; i < cars.length; i++) {
		
		 for (int j = 0; j < cars[i].length; j++) {
			 System.out.print(cars[i][j]);
		}
	}
	 
	 for (String[] carGroups: cars) {
	for (String car : carGroups) { 
		System.out.print(car + " ");
	}
} System.out.println();

for (String[] carGroups: cars) {
	
	System.out.println(Arrays.deepToString(carGroups));
}
	}

}

package classwork;

public class StringArray {

	public static void main(String[] args) {
		
		String[] movie= new String[4];
		movie[0]="Home Alone";
		movie[1]="Brigada";
		movie[2]="Golos";
		movie[3]= "Comedy club";
		//getting the count of array
		//we are using length property of array object
		System.out.println(movie.length);
		//getting the char count of String
		//we are using the length method with parenthesis
		for (int j = 0; j < movie.length-1; j++) {
			
		System.out.println(movie[j]+"char count is; "+movie[j].length());
	}
	int max = movie[0].length();
	for (int i = 1; i < movie.length; i++) {
		if(movie[i].length() > max) {
			max= movie[i].length();		
	}
	}System.out.println(max);
		
	}}



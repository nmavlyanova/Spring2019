package classwork;

public class MaxLengthWord {

	public static void main(String[] args) {
		
		String[] movie= new String[4];
		movie[0]="Home Alone";
		movie[1]="Brigada";
		movie[2]="Golos";
		movie[3]= "Comedy club";
		
		
		int max = movie[0].length();
		int index=0;
		for (int i = 1; i < movie.length; i++) {
			if(movie[i].length() > max) {
				max= movie[i].length();
				index= i;
		}
		}System.out.println(index);
			System.out.println(movie[index]);
		}}

	



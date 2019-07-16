package replit;
//max function gets two ints, x and max.
//x is the test case, max is what we test against.
//
//if  x is bigger then max return max
//in any other case return x.
//
//for example:
//
//max(1,10)
//returns 1
//
//max(11,5)
//returns 5
public class Task156 {

	public static void main(String[] args) {
		System.out.println(maxFunc(11,5));

		}
		public static int maxFunc(int x, int max) {
			if(x>max) {
				return max;
			}else {
			return x;
		}

	}}
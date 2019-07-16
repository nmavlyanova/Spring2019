package homework;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int [] num = new int [] {1,4,6,8,9};
		num[2]*=2;
		num[3] = num[0]+num[1];
		int sum =0;
		int max = num[0];
		for (int i = 0; i <num.length; i++) {
			System.out.print(num[i]+" ");}
		System.out.println();
		
			for (int i = 0; i < num.length; i++) {
				
			
			int x = num[4];
			num[4]=num[0];
			num[0]=x;
			System.out.print(num[i]+" ");
			}
			System.out.println();
			for (int j = 0; j < num.length; j++) {
			sum+=num[j]; 
		}
			System.out.print(sum);
			
			for (int i = 1; i < num.length; i++) {
				if (num[i]>max) {
					max=num[i];
				}
			}System.out.println(max);
	}
		
	
	}


package homework;


//A 2D array is considered "magic" if the following are true:
//The array is square (N rows and N columns)
//The sums of each row, the sums of each column, and the sums of each diagonal are all equal.
//
//Complete the isMagic method so that it will determine whether a given array is magic.
public class TwoDArrayMagic {

	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isMagic(a)); //true
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		System.out.println(isMagic(b)); //false
		int[][] c = {
			{1,1,1},
			{2,2,2}
		};
		System.out.println(isMagic(c)); //false
		int[][] d = {
			{8,1,6},
			{3,5,7},
			{4,9,2}
		};
		System.out.println(isMagic(d)); //true
	}
	public static boolean isMagic(int[][] a)
	{ if(a.length == 0)
        return true;
        
    int sum = 0;
    int len = a[0].length;
    
    for(int j = 0; j < a[0].length; j++)
        sum += a[0][j];
        
    for(int i = 1; i < a.length; i++) {
        if(a[i].length != len)
            return false;
            
        int rowSum = 0;
        
        for(int j = 0; j < a[i].length; j++)
            rowSum += a[i][j];
            
        if(rowSum != sum)
            return false;
    }
    
    for(int j = 0; j < a.length; j++) {
        int colSum = 0;
        
        for(int i = 0; i < a.length; i++)
            colSum += a[i][j];
            
        if(colSum != sum)
            return false;
    }
    
    int diag = 0;
    
    for(int i = 0; i < a.length; i++)
        diag += a[i][i];
        
    if(diag != sum)
        return false;
        
    diag = 0;
    
    for(int i = 0; i < a.length; i++)
        diag += a[a.length - i - 1][i];
        
    return diag == sum;
}
	
	
	
}

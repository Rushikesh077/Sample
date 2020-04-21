package test;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	        // Printing Neon Numbers upto 10000
	      /*  for (int i = 1; i <= 10000; i++) 
	            if (checkNeon(i))
	                System.out.print(i + " "); */    
			System.out.println(checkNeon(9));
	    }
	}

	 static int checkNeon(int x)
	    {
	        // storing the square of x
	        int sq = x * x;
	 
	        // calculating the sum of sum of digits
	        // of sq
	        int sum_digits = 0;
	        while (sq != 0) {
	            sum_digits = sum_digits + sq % 10;
	            sq = sq / 10;
	        }
	     if    (sum_digits == x)
	     {
	    	 return 1;
	     }
	     return 0;
	    }
	 

}


import java.util.Scanner;

public class FibonacciUsingRecursion {
    public void fibonacci(int k)
    {
    	int n = 10, t1 = 0, t2 = 1,t3;
        System.out.print("First " + k + " terms: ");

        for (int i = 1; i <= k; i++)
        {
            System.out.print(t1 + "  ");

            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
		
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,i;
          System.out.println("Enter number");
          Scanner in=new Scanner(System.in);
          n=in.nextInt();
          FibonacciUsingRecursion f=new FibonacciUsingRecursion();
          f.fibonacci(n);
          /*for(i=0;i<n;i++)
          {
        	  System.out.print(fibo(i)+" ");
          }*/
	}

	private static int fibo(int i) {
		// TODO Auto-generated method stub
		if(i==0)
			return 0;
		else if(i==1)
			return 1;
		else
		return (fibo(i-1)+fibo(i-2));
	}

}

import java.util.Scanner;

public class SummationOfFactorial {

	public static void main(String[] args) {
	   int n,m,sum=0,fact=1;
	   System.out.println("Enter Number");
	   Scanner in=new Scanner(System.in);
	    n=in.nextInt();
	   for(int i=1;i<=n;i++)
	   {
		   m=i;
		   fact=1;
		   while(m>1)
		   {
			   fact=fact*m;
			   m--;
		   }
		   sum=sum+fact;
	   }
	   System.out.println("Factorial of number is"+"  "+fact);
	   System.out.println("summation of Factorial"+" " +sum);

	}

}

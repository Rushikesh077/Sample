import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n,fact;
          System.out.println("Enter number");
          Scanner in=new Scanner(System.in);
          n=in.nextInt();
          fact=factorial(n);
          System.out.println("Factorial is"+"   "+fact);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		else
		return n*factorial(n-1);
	}

}

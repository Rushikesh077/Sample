import java.util.Scanner;

public class PerfectNumber {

	public boolean isPerfectNumber(int number)
	{
		int temp=0;
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				temp+=i;
			}
		}
		if(temp==number)
		{
			System.out.println("It is perfect Number");
			return true;
		}
		else
		{
			System.out.println("It is  not perfect Number");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		PerfectNumber i=new PerfectNumber();
		Scanner num=new Scanner(System.in);
		System.out.println("please enter number");
		Integer ip=num.nextInt();
		System.out.println("is it perfect number"+"  "+i.isPerfectNumber(ip));


	}

}

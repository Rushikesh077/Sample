
public class PrimeNo {
	static int count; 
	public void isprime(int num)
	{
		boolean flag = false;
		for(int i = 2; i <= num/2; i++)
		{
			// condition for nonprime number
			if(num % i == 0)
			{
				flag = true;

				break;
			}
		}

		if (flag==false)
		{
			System.out.println(num + " is a prime number.");
		}

		else
			System.out.println(num + " is not a prime number.");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo p=new PrimeNo();
		//	p.isprime(290);
		int i,num;

		//Empty String
		String  primeNumbers = "";

		for (i = 200; i <= 800; i++)         
		{ 		  	  
			int counter=0; 	  
			for(num=i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
				count++;
			}	
		}	
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
		System.out.println("Total PrimeNumbers are"+" "+count);
	}

}

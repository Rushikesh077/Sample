import java.util.Scanner;

public class ArrayPrctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[4];
		int b[]=new int[4];
		Scanner in=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<4;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			b[i]=a[i];
		}
		
		for(int i=0;i<4;i++)
		{
			int temp=i;
			int product=1;
			for(int j=0;j<4;j++)
			{
				if(temp!=j)
				{
				product=product*b[j];
				}
			}
		   a[i]=product;
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		
		}
		
	}

}

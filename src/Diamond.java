
public class Diamond {

	public static void main(String[] args) {

		
		int i,j,k,l,m;
		int n=0;
		for( i=0;i<4;i++)
		{
			for(k=4;k>i; k--)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print(n);
			}
             
			for(l=k+1;l<k+2;l++)
			{
				for(m=0;m<l;m++)
				{
					System.out.print(n);
				}
			}
			System.out.println();
			n++;
		}

	
		for( i=4;i>=0;i--)
		{
			for(k=4;k>i; k--)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print(n);
			}
             
			for(l=k+1;l<k+2;l++)
			{
				for(m=0;m<l;m++)
				{
					System.out.print(n);
				}
			}
			System.out.println();
			n--;
		}
		
	}

}

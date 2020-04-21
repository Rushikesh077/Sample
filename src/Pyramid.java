
public class Pyramid {

	public static void main(String[] args) {
		int i,j,k,l,m;
		for( i=0;i<4;i++)   //for row
		{
			for(k=4;k>i; k--)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
             
			for(l=k+1;l<k+2;l++)
			{
				for(m=0;m<l;m++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}

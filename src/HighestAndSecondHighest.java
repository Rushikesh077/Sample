import java.util.Scanner;

public class HighestAndSecondHighest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        if(n > 1)
        {
            int a[] = new int[n];
            System.out.println("Enter all the elements:");
            for(int i = 0; i < n ; i++)
            {
                a[i] = s.nextInt();
            }
            for(int i = 0; i < n; i++)
            {
                for(int j = i + 1; j < n; j++)
                {
                    if(a[i] < a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.println("Largest  number is:"+a[0]+" and  second largest number is:"+a[1]+"   Lowest number is:"+a[n-1]);
        }
        else
        {
            System.out.println("Enter number greater than 1");
        }
 
	}

}

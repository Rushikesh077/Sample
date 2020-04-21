import java.util.Date;
import java.util.Scanner;

public class rev {

	public static void main(String[] args) {
		
		//Date d=new Date();
	//	System.out.println(d);
		Scanner in=new Scanner(System.in);
		System.out.println("please enter size");
		int s=in.nextInt();
		int[] arr=new int[s];
		System.out.println("Please Enter array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
         System.out.println("array elements in reverse order are");
         for(int i=(arr.length-1);i>=0;i--)
         {
        	 System.out.println(arr[i]);
         }
	}

}

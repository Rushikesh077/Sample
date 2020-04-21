import java.util.Scanner;

public class BinarySearch {
/*                  Limitation of binary search
 *                  Array need to be sorted
                    Can not apply on linked list (elements need to be contiguous in memory)
                    Cache performance is also not good (because we are accessing n/2 th position of array every time).
 */
	public static int search()
	{
		int first,last,flag=0;
		System.out.println("enter size of array");
	    Scanner in=new Scanner(System.in);
	    int size=in.nextInt();
		int[] arr=new int[size];
	//	int s[]={2,4,5,6,80,10,15};
	    System.out.println("Enter array elements");
	    for(int i=0;i<size;i++)
	    {
	    	arr[i]=in.nextInt();
	    }
	    System.out.println("Enter the number that you want to search");
	    int num=in.nextInt();
	    first=0;
	    last=size-1;
	    int mid=0;
	    while(first<=last)
	    {
	    	mid=(first+last)/2;
	    	if(arr[mid]<num)
	    	{
	    		first=mid+1;
	    	}
	    	else
	    	{
	    		last=mid-1;
	    	}
	    	if(arr[mid]==num)
	    	{
	    		System.out.println("Number"+num+"is found at"+mid);
	    		flag=1;
	    		return mid;
	    		//break;
	    	}
	    }
	    if(flag==0)
	    {
	    	System.out.println("No elements are found");
	    }
	    return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              BinarySearch.search();
	}

}

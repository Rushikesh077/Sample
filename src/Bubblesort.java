import java.util.Scanner;

public class Bubblesort {
	public void sort()
	{
	int temp;
	System.out.println("Enter size of array");
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	int[] array=new int[size];
    System.out.println("Enter array elements");
    for(int i=0;i<size;i++)
    {
    	array[i]=in.nextInt();
    }
   for(int i=0;i<(size-1);i++)
    {
    	for(int j=0;j<(size-i-1);j++)
    	{
    		if(array[j]>array[j+1])
    		{
    			temp=array[j];
    			array[j]=array[j+1];
    			array[j+1]=temp;
    		}
    	}
    }
   
    
    
    System.out.println("sorted elements are");
    for(int i=0;i<size;i++)
    {
    	System.out.println(array[i]);
    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Bubblesort s=new Bubblesort();
          s.sort();
	}

}

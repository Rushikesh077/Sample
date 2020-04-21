package test;

import java.util.Arrays;

public class SortArrayElements {

	public static int remove(int arr[],int n)
	{
		 if (n==0 || n==1){  
	            return n;  
	        }  
		int j=0;
		int temp[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		return j;
	}
	
	public static void main(String[] args) {
		int arr[]={10,20,30,100,150,350};
		Arrays.sort(arr);
		int l=arr.length;
		l=remove(arr,l);
		for(int i=0;i<l;i++)
		{
			System.out.println(arr[i]);
		}


	}

}

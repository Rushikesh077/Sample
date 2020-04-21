package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFileSort {


	FileReader fr;
	String data="";
	public  void fileRead()
	{
		String path="Demo.txt";
		
		
		int i;
		try {
			fr=new FileReader(path);			
			
			try {
				while((i=fr.read())!=-1)
				{
					data=data+(char)i;
				}
				System.out.println(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
				System.out.println("Finally executed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public  void BinarySearch()
	{
		int temp,mid,num,size,flag=0;
		Scanner in=new Scanner(System.in);
		System.out.println("in binary search"+data);
	    // int []inx=Arrays.asList(data).stream().mapToInt(Integer::parseInt).toArray();
		int[] inx = Arrays.asList(data.split(",")).stream().map(String::trim).mapToInt(Integer::parseInt).toArray();
		//String arr[]=new String[inx];
		System.out.println("Enter array elements");
		for(int i=0;i<inx.length;i++)
		{
			System.out.print(inx[i]+"  ");
		}

		
		for(int i=0;i<inx.length;i++)
		{
			for(int j=i+1;j<inx.length;j++)
			{
				if(inx[i]>inx[j])
				{
					temp=inx[i];
					inx[i]=inx[j];
					inx[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted Elements are");
		{
			
			for(int i=0;i<inx.length;i++)
			{
				System.out.print(inx[i]+"  ");
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		//Pratice.BinarySearch();
		ReadFromFileSort p=new ReadFromFileSort();
		p.fileRead();
		p.BinarySearch();
	}


}

package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int N = 10;
	private int[] A = new int[] { 5, 10, 20, 2, 4, 5, 1, 9, 50, 8 };
	private int B = 6;
	private int X = 5;
	private int Y = 3;
	private int ans = 0;
	private ArrayList<Integer> firstList = new ArrayList<>();
	private HashMap<Integer,Integer> count = new HashMap<>();
	private ArrayList<Integer> secondList = new ArrayList<>();
	private ArrayList<Integer> secondElementList = new ArrayList<>();
	private int gcf=0;
	
	public void first() {
		List<Integer> brideList = new ArrayList<>(A.length);
		for (int i : A) { 
			brideList.add(Integer.valueOf(i));
		}
		if(brideList.contains(B))
			firstList.add(B);
		for (int i = 1; i < brideList.size(); i++) {
			if(brideList.contains(B+i)) {
				firstList.add((B+i));
				if(brideList.indexOf((B+i)) != brideList.lastIndexOf((B+i)))
					firstList.add(B+i);
			}
				
			if(brideList.contains(B-i)) {
				firstList.add(B-i);
				if(brideList.indexOf((B-i)) != brideList.lastIndexOf((B-i)))
					firstList.add(B-i);
			}
			if(firstList.size()==X) {
				break;
			}
			/*if(firstList.size()>X) {
				return -1;
			}*/
				
		}
		for(int i=0;i<firstList.size();i++) {
			String binary = Integer.toBinaryString(firstList.get(i));
			int counter = 0;
			for( int j=0; j<binary.length(); j++ ) {
			    if( binary.charAt(j) == '1' ) {
			        counter++;
			    } 
			    }
			count.put(i,counter);
		}
		Set<Entry<Integer,Integer>> entrySet = count.entrySet();
		List<Entry<Integer,Integer>> sorted = new ArrayList<Entry<Integer,Integer>>(entrySet);
		Collections.sort(sorted, new Comparator<Entry<Integer,Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return (o2.getValue().compareTo(o1.getValue()));
			}
		});
	/*	for(Entry<Integer,Integer> i:sorted) {
			System.out.println(i);
		}*/
		int third=-1,fourth=-1;
		for(Entry<Integer,Integer> i:sorted) {
			
			secondList.add(i.getKey());
			if(secondList.size() == Y) {
				third = secondList.get(Y-1);
				//System.out.println("third"+third);
			}
			if(secondList.size() == Y+1) {
				fourth = secondList.get(Y);
				
			//	System.out.println("fourth"+fourth);
			}
			
			if(third != -1 && fourth != -1) {
				System.out.println("inside last condition");
				if(third == fourth) {
					System.out.println("-2");
					//return -2;
				}
				else {
					secondList.remove(Y);
				//	System.out.println("break");
					break;
				}
			}
		}
		for(int i:secondList)
		{
			secondElementList.add(firstList.get(i));
		}
		System.out.println(secondElementList);
		for (int i:secondElementList)
		{
			for (int j=0;j<=secondElementList.size();j++)
			{
				if (j%i==0)
				{
					gcf=i;
				}
			}
		}
		System.out.println(gcf);
	/*	int []aelements=convert(secondElementList);
		int len=aelements.length;
		System.out.println(findGcd(aelements,len));
		*/
	}
	public  static int findGcd(int []arr,int x)
	{
		int result=arr[0];
		for (int i=1;i<x;i++)
		{
			result=gcd(arr[i],result);
		}
		return result;
	}
	public static int gcd(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		return gcd(b%a,a);
	}
	public static int[] convert(ArrayList<Integer> slist)
	{
		int []arr=new int[slist.size()];
		for (int i=0;i<slist.size();i++)
		{
			arr[i]=slist.get(i).intValue();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
	  Question q=new Question();
	  q.first();
     
	}

}

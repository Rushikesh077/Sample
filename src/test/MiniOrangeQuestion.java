package test;

import java.util.Scanner;

public class MiniOrangeQuestion {

	public static void main(String[] args) {
		int size;
		int row,col;
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter number of rows of  matrix");
		row=in.nextInt();
		System.out.println("Please enter number of columns of  matrix");
		col=in.nextInt();
		System.out.println("please enter width of subsquare matrix");
		size=in.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Please Enter elements of matrix");	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}

		
	    int [][] total = new int[arr.length-size+1][arr[0].length-size+1];
		int max[]= new int[2];
		//System.out.println(arr[0].length);
		for(int i=0;i<=(arr.length-size);i++) {                // for rows
			
			for(int j=0;j<=(arr[0].length-size);j++) {         // for columns
				//System.out.print(arr[i][j]);
				int rowFirstSum=0, rowLastSum = 0,rowMiddleSum=0;
				int leftMiddleSum=0,rightMiddleSum =0;
				
				int[][] temp = new int[1][];
				//System.out.println("inside j loop"+i+" "+j);
				for(int k=0;k<size;k++) {
					rowFirstSum += arr[i][j+k];                  //getting first row elements
					rowLastSum += arr[i+size-1][j+k];				 // getting last row elements
					if(j == j+k) {
						for(int m=1;m<size-1;m++) {
							leftMiddleSum += arr[i+m][j];
						}
					}
					
					if((size-1) == k) {
						for(int m=1;m<size-1;m++) {
							rightMiddleSum += arr[i+m][j+size-1];
						}
					}
					
					
				}
				
				total[i][j] = rowFirstSum+rowLastSum+leftMiddleSum+rightMiddleSum;
				//System.out.println(i+" "+j+" "+rowFirstSum+rowLastSum+leftMiddleSum+rightMiddleSum+" "+total[i][j]);
				
			}
			//System.out.println(" ");
			
		}
		int maxValue = total[0][0];
		max[0]=0;max[1]=0;
		//System.out.println(total.length);
		//System.out.println(total[0].length);
		for(int i=0;i<total.length;i++) {
			for(int j=0;j<total[0].length;j++) {
				//System.out.println(i+" "+j+" "+total[i][j]);
				if(total[i][j] > maxValue) {
					max[0] = i;
					max[1] = j;
					maxValue = total[i][j];
					//System.out.println(maxValue+" "+i+" "+j);
				}
			}
		}
		//System.out.println(maxValue);
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[max[0]+i][max[1]+j]+ " ");
			}
			System.out.println(" ");
		}
	}

}

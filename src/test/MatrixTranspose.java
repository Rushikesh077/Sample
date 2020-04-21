package test;

import java.util.Scanner;

public class MatrixTranspose {

	public int[][] solution(int A[][],int m,int n)
	{
		int c,d;
	 
	      int transpose[][] = new int[n][m];
	 
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)               
	            transpose[d][c] = A[c][d];
	 
	      System.out.println("Transpose of the matrix:");
	 
	   
		
		
		
		return transpose;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  mat[][]={{1,2,3,4},
			    	{2,9,-1,2}};
		 int m=2,n=4,c,d;
		 MatrixTranspose mt=new MatrixTranspose();
		int tran[][]= mt.solution(mat, m, n);
		   for (c = 0; c < n; c++)
	      {
	         for (d = 0; d < m; d++)
	         {
	        	System.out.print(tran[c][d]+"\t");
	         }
	         System.out.print("\n");
	      }

		
/*		int m, n, c, d;
		 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the number of rows and columns of matrix");
	      m = in.nextInt();
	      n = in.nextInt();
	 
	      int matrix[][] = new int[m][n];
	 
	    //  System.out.println("Enter the elements of matrix");
	   
	    
	    for (c = 0; c < 2; c++)
	    {
	    	 for (d = 0; d < 4; d++)
	         {
	        	 System.out.print(mat[c][d]+"\t");
	         }
	    	 System.out.println(" ");
	    }
	        
	     
	     for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            matrix[c][d] = in.nextInt();
	 
	      int transpose[][] = new int[n][m];
	 
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)               
	            transpose[d][c] = matrix[c][d];
	 
	      System.out.println("Transpose of the matrix:");
	 
	      for (c = 0; c < n; c++)
	      {
	         for (d = 0; d < m; d++)
	         {
	        	 System.out.print(transpose[c][d]+"\t");
	         }
	         System.out.print("\n");
	      }
	 	
	}*/
	}
}

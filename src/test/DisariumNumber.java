package test;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       System.out.print("Input a number : ");
        int num = sc.nextInt();
        int copy = num, d = 0, sum = 0;
        String s = Integer.toString(num); 
        System.out.println(s);
       int len = s.length();  
        System.out.println(len);
        while(copy>0)
        {
            d = copy % 10;  
            sum = sum + (int)Math.pow(d,len);
            len--;
            copy = copy / 10;
        }
         
        if(sum == num)
           System.out.println("Disarium Number.");
       else
           System.out.println("Not a Disarium Number.");
     
		 

	}

}

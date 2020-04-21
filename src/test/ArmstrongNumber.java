package test;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static int power(int n, int r) {
	      int c, p = 1;
	      for (c = 1; c <= r; c++) 
	      {
	    	  p = p*n;
	      }
	      return p;
	}
	
	public void check()
	{
		int n, sum = 0, temp, remainder, digits = 0;
		 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Input a number to check if it is an Armstrong number");      
	      n = in.nextInt();
	 
	      temp = n;
	 
	      // Count number of digits
	 
	      while (temp != 0) {
	         digits++;
	         temp = temp/10;
	      }
	 
	      temp = n;
	 
	      while (temp != 0) {
	         remainder = temp%10;
	         sum = sum + power(remainder, digits);
	         temp = temp/10;
	      }
	 
	      if (n == sum)
	         System.out.println(n + " is an Armstrong number.");
	      else
	         System.out.println(n + " isn't an Armstrong number.");         
	   }
	public static boolean isArmstrong(int input) {
	       String inputAsString = input + "";
	       int numberOfDigits = inputAsString.length();
	       int copyOfInput = input;
	       int sum = 0;
	       while (copyOfInput != 0) {
	           int lastDigit = copyOfInput % 10;
	           sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
	           copyOfInput = copyOfInput / 10;
	       }
	       if (sum == input) {
	           return true;
	       } else {
	           return false;
	       }
	   }
	public static boolean isNarc(long x){
	    if(x < 0) return false;

	    String xStr = Long.toString(x);
	    int m = xStr.length();
	    long sum = 0;

	    for(char c : xStr.toCharArray()){
	        sum += Math.pow(Character.digit(c, 10), m);
	    }
	    return sum == x;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber an=new ArmstrongNumber();
		//an.check();
		 Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a number: ");
	       int inputNumber = scanner.nextInt();
	      // boolean result = isArmstrong(inputNumber);
	       boolean result = isNarc(inputNumber);
	       if (result) {
	           System.out.println(inputNumber + " is an armstrong number");
	       } else {
	           System.out.println(inputNumber + " is not an armstrong number");
	       }
		
			
	}
}

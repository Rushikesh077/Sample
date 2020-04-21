package test;

import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		         System.out.print("Please enter a 3 digit number: ");
		         int number = scanner.nextInt();
		         if (number < 100 || number > 999) {
		 
		             System.out.println(number + " is not a valid 3 digit number!");
		 
		         } else {
		 
		             if (isFascinatingNumber(number)) {
		 
		                 System.out.println(number + " is a fascinating number!");
		 
		             } else {
		 
		                 System.out.println(number + " is NOT a fascinating number!");
		 
		             }
		 
		         }
		         scanner.close();
		
		     }
		 
		     // Checks whether the input number is a fascinating number
		 
		     public static boolean isFascinatingNumber(int input) {
		 
		         String sVal = "" + input + input * 2 + input * 3;
		 
		         // check existence of 1 to 9 exactly once!
		 
		         for (int i = 1; i <= 9; i++) {
		 
		             int pos = sVal.indexOf(i + "");
		 
		             // is digit missing?
		 
		             if (pos < 0) {
		 
		                 return false;
		 
		             } else {
		 
		                 // Is there a duplicate digit?
		 
		                 if (sVal.substring(pos+1).indexOf(i + "") >= 0) {
		 
		                     return false;
		 
		                 }
		 
		             }
		         }
		 
		         System.out.println(sVal);
		 
		         return true;
		 
		     }
		}

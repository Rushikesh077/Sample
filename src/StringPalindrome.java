import java.util.Scanner;

public class StringPalindrome {

	 public static boolean isPalindrome(String str)
     {
   	  StringBuilder sb=new StringBuilder(str);
   	  StringBuilder re=sb.reverse();
       
   	  if(str.equals(String.valueOf(re)))
   	  {
   		  return true;
   	  }
   	  return false;
     }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the word/string");
         String s=in.nextLine();
         String r="";
         for(int i=s.length()-1;i>=0;i--)
         {
        	 r=r+s.charAt(i);
         }
         System.out.println("Reverse word/string is"+"       "+r);
         if(r.equals(s))
         {
        	 System.out.println("String is palindrome");
         }
         else
         {
        	 System.out.println("String is not palindrome");
         }
       /*  if(isPalindrome(s))
 		{
 			System.out.println("String is palindrome");
 		}
 		else
 		{
 			System.out.println("String is not palindrome");
 		}*/
	}

}

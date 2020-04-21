import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=in.nextInt();
		System.out.println("Enter the second number");
		int n2=in.nextInt();
//		int temp=n1;
//		n1=n2;
//		n2=temp;
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
//		         String a = "one";
//				String b = "two";
//				String temp = null;
//				temp = a;
//				a = b;
//				b = temp;
//		
//		       System.out.println(a+b);
//		
		
		
		/*
		 * String binary;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number");
	    value=sc.nextInt();
	    binary=Integer.toBinaryString(value);
	    System.out.println(binary);
		 */
		
//		String a = "one";
//    	String b = "two";
//
//		a = a + b;
//		
//		b = a.substring(0, (a.length() - b.length()));
//		a = a.substring(b.length());
//
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		
		System.out.println("Numbers after swapping are"  +n1+n2);
		
	}

}

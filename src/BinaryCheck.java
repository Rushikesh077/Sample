
public class BinaryCheck {
   public void isBinary(int binary)
   {
	    boolean status=true;
	    int temp;
	    while(true)
	     {
		   if(binary==0)
		     {
			   break;
		     }
		   else
			    temp=binary%10;
		      if(temp>1)
		      {
		    	  status=false;
		    	  break;
		      }
		      binary=binary/10;
	   }
	    if(status==true)
	    {
	    	System.out.println("It is binary number");
	    }
	    else
	    	System.out.println("It is not binary number");
   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryCheck ch=new BinaryCheck();
	    ch.isBinary(1110001);
        ch.isBinary(111301);
	}

}

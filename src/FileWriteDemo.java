import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		       FileWriter fw=new FileWriter("Demo.txt");
		      // FileWriter fw1=new FileWriter("Rushi.txt");
	           String path="Demo.txt";
		      FileReader fr=new FileReader(path);
           try {
		        Scanner in=new Scanner(System.in);
		        System.out.println("Please enter something");
		        String s=in.nextLine();
		         fw.write(s);
	       } catch (IOException e) {
		     // TODO Auto-generated catch block
		     e.printStackTrace();
	       }
		
		int i;
		String data="";
		try
		{
		while((i=fr.read())!=-1)
		{
			 data +=(char) i;
			
		}
		System.out.println(data);
		//fw1.write(data);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
      finally
      {
    	    fw.close();
    	    fr.close();
    	  System.out.println("finally executed");
    	  
      }
	}

}

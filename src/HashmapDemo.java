import java.util.HashMap;
import java.util.*;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Rushikesh", new Integer(10000));
		hm.put("Joshi", new Integer(20000));
		hm.put("Rushi", new Integer(30000));
		hm.put("RJ", new Integer(40000));
		Set set=hm.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		
		}
             System.out.println();
             Integer balance=((Integer) hm.get("Rushikesh")).intValue();
             hm.put("Rushikesh", new Integer(balance)+30000);
             System.out.println("New Salary of Rushikesh"+"  "+hm.get("Rushikesh"));
	}

}

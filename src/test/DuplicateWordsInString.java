package test;
import java.lang.String;
import java.util.HashMap;
import java.util.Set;;
public class DuplicateWordsInString {

	public static void main(String[] args) {
		String input="This is comp. This is  is"; 		//Input String	
		String[] words=input.split(" ");	//Split the word from String
//		int wrc=1;							//Variable for getting Repeated word count
//       
//
//		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
//		{
//
//			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
//			{
//
//				if(words[i].equals(words[j]))	//Checking for both strings are equal
//				{
//					wrc=wrc+1;				//if equal increment the count
//					words[j]="0";			//Replace repeated words by zero
//				}
//			}
//			if(words[i]!="0")
//			{
//				System.out.println(words[i]+"--"+wrc);	//Printing the word along with count
//			}
//
//			wrc=1;
//		}
		
		 HashMap<String, Integer> map = new HashMap<>();

	        for (String t : words) {
	            if (map.containsKey(t)) {
	                map.put(t, map.get(t) + 1);

	            } else {
	                map.put(t, 1);
	            }
	        }
	        Set<String> keys = map.keySet();
	        for (String key : keys) {
	            System.out.println(key);
	            
	            System.out.println(+map.get(key));
	        }
		
	}
}


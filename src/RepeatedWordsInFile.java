import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordsInFile {

	public static void main(String[] args) throws IOException {
           HashMap<String,Integer> wordCountMap=new HashMap<>();
           BufferedReader reader=null;
           try {
			reader=new BufferedReader(new FileReader("Rushi.txt"));
			String currentline=reader.readLine();
			while(currentline!=null)
			{
				
				String[] words=currentline.toLowerCase().split(" ");
				    for(String word:words)
				    {
					if(wordCountMap.containsKey(word))
					{
						wordCountMap.put(word,wordCountMap.get(word)+1);
					}
					else
					{
						wordCountMap.put(word, 1);
					}
				}
			//	currentline=reader.readLine();
			//	System.out.println(currentline);
			}
			Set<Entry<String,Integer>> entryset=wordCountMap.entrySet();
			List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(entryset);
			Collections.sort(list, new Comparator<Entry<String,Integer>>(){

				@Override
				public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
					// TODO Auto-generated method stub
					return (e2.getValue().compareTo(e1.getValue()));
				}
				
			});
			System.out.println("Repeated words in file are:");
			    for(Entry<String,Integer> entry:list)
			    {
			    	if(entry.getValue()>=1)
			    	{
			    		System.out.println(entry.getKey()+" : "+entry.getValue());
			    		for(int i=0;i<entry.getValue();i++)
			    		{
			    			System.out.println(entry.getKey());
			    		}
			    	}
			    }
			
	         	} 
           catch (FileNotFoundException e) 
           {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
           finally
           {
        	   reader.close();
           }
           
	}

}

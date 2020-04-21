import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {
      public void findDuplicate(String str)
      {
    	  Map<Character,Integer> dup=new HashMap<Character,Integer>();
    	  char[] chr=str.toCharArray();
    	  for(Character ch:chr)
    	  {
    	  if(dup.containsKey(ch))
    	  {
    		  dup.put(ch, dup.get(ch)+1);
    	  }
    	  else
    	  {
    	  dup.put(ch,1);
    	  }
    	 
    	  }
    	 
    	  Set<Character> keys=dup.keySet();
     	  for(Character cha:keys)
    	  {
    		  if(dup.get(cha)>1)
    		  {
    			  System.out.println(cha+"  "+dup.get(cha));
    		  }
    	  }
    	  
      }
      
      public void dup(String str)
      {
    	  String item[] = str.split(" ");

          HashMap<String, Integer> map = new HashMap<>();

          for (String t : item) {
              if (map.containsKey(t)) {
                  map.put(t, map.get(t) + 1);

              } else {
                  map.put(t, 1);
              }
          }
          Set<String> keys = map.keySet();
          for (String key : keys) {
              System.out.print(key);
              System.out.print("  ");
              System.out.println(map.get(key));
          }
 
      }
      
	public static void main(String[] args) {
	
		DuplicateCharInString s=new DuplicateCharInString();
		
		//s.findDuplicate("ABCABC");
		s.dup("This This This is ");
	}

}

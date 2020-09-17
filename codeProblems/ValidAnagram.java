

import java.util.*;



class ValidAnagram { 
  
   
    public boolean isAnagram(String s, String t) 
    {

	     //check to see if the strings are the same length
	    if (s.length() != t.length())
	    {
	        return false;
	    }

		        
		 Map<Character, Integer> map = new HashMap<>();



		for (char c : s.toCharArray()) 
		{
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}
		        
		for (char c : t.toCharArray()) 
		{
		    if (map.containsKey(c)) 
		    {
		    		
		    	int count = map.get(c);
		    	if (count == 1)
		    		map.remove(c);
		    	else 
		    		map.put(c, count - 1);
		    }
		}
		        
		return map.isEmpty();
        
    
	}

    public static void main(String args[]) 
    { 

        ValidAnagram program = new ValidAnagram();

        boolean result = program.isAnagram("anagram","nagaram");

        System.out.println(result);
       
    } 
} 
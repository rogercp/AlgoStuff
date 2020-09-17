

import java.util.*;

//Given two strings s and t , write a function to determine if t is an anagram of s.

class ValidAnagram { 
  
   
    public boolean isAnagram(String s, String t) 
    {

	    //check to see if the strings are the same length
	    if (s.length() != t.length())
	    {
	        return false;
	    }

		//create hashmap to store character and the occurences
		 Map<Character, Integer> map = new HashMap<>();


		 //iterate shorthand through String
		for (char c : s.toCharArray()) 
		{
			//use hashmap method to place key and value
			//the getorDefault method is used to either get the value and manipulate it 
			//or if there is no value associated with the key then set a default in this case 0
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}
		      
		//iterate shorthand through second string  
		for (char c : t.toCharArray()) 
		{
			//checking if the character is a key in our hashmap
		    if (map.containsKey(c)) 
		    {
		    		
		    	//holding the value of the key for manipluation later on
		    	int count = map.get(c);
		    	//if the value of the key is 1 that means we can remove it from the hashmap
		    	//else we decrement the value by 1
		    	if (count == 1)
		    		map.remove(c);
		    	else 
		    		map.put(c, count - 1);
		    }
		}
		        
		//Is an anagram if the hashmap returns true
		return map.isEmpty();
        
    
	}

    public static void main(String args[]) 
    { 

        ValidAnagram program = new ValidAnagram();

        boolean result = program.isAnagram("anagram","nagaram");

        System.out.println(result);
       
    } 
} 
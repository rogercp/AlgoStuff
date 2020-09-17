
import java.util.*;

class FirstUniqueCharInString { 
  
   
    public int firstUniqChar(String s) 
    {

	 Map<Character,Integer> myMap = new HashMap<Character, Integer>();
	        
	        
	        
	        for(int i=0 ; i< s.length();i++)
	        {
	            
	           if(myMap.containsKey(s.charAt(i)))
	           {
	               int current = myMap.get(s.charAt(i));
	               
	               myMap.put(s.charAt(i),current +=1);
	               
	           }
	            else
	            {
	                           
	                myMap.put(s.charAt(i),1);    
	            }
	            
	        }
	        
	        for( int j = 0 ; j < s.length() ;j++)
	        {
	            
	            int currentCharacter = myMap.get(s.charAt(j));
	                
	            if(currentCharacter == 1)
	            {
	                return j;
	            }
	            
	        }
	        
	                    
	        return -1;
	    

	}

    public static void main(String args[]) 
    { 

        FirstUniqueCharInString program = new FirstUniqueCharInString();

        int result = program.firstUniqChar("loveleetcode");

        System.out.println(result);
       
    } 
} 
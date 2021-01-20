
import java.util.*;

// Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.


class FirstUniqueCharInString { 
  
   
    public int firstUniqChar(String s) 
    {


    //create a hashmap to store our character from our string and the number of
   	//occurances in the string
	 Map<Character,Integer> myMap = new HashMap<Character, Integer>();
	        
	        
	        //first loop throught the string a first time to get all the characters 
			//and their occurance count
	        for(int i=0 ; i< s.length();i++)
	        {
	           
	           //if its in the hashmap increment
	           if(myMap.containsKey(s.charAt(i)))
	           {
	               int current = myMap.get(s.charAt(i));
	               
	               myMap.put(s.charAt(i),current +=1);
	               
	           }
	           //if not then add it
	            else
	            {
	                           
	                myMap.put(s.charAt(i),1);    
	            }
	            
	        }
	        
	       	//we loop through the string again but this time we have the info on how many times 
	       	//each character occurs in the string
	        for( int j = 0 ; j < s.length() ;j++)
	        {
	            // we retrieve the occurance amount from our hashmap
	            //and hold it in a variable
	            int currentCharacter = myMap.get(s.charAt(j));
	                
	            //we check to see if that occurances only happens once 
	            //meaning its unique if it is we return the index at where that character 
	           //is currently and that ends our loop with the return 
	            if(currentCharacter == 1)
	            {
	                return j;
	            }
	            
	        }
	        
	        //if we get through all the characters that means that there are no unique characters 
	        //so we just return a negative one
	        return -1;
	    

	}

    public static void main(String args[]) 
    { 

        FirstUniqueCharInString program = new FirstUniqueCharInString();

        int result = program.firstUniqChar("loveleetcode");



        System.out.println(result);
       
    } 
} 
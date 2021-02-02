

import java.util.*;

// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

public class WordPattern{ 
  
    static boolean wordPatternTrueOrFalse(String pattern, String s ) 
    { 


        Map<Character,String> myMap = new HashMap<Character,String>();

        boolean returnBool = true;

        int i;
       
        int j;

        while(i< pattern.length())
        {
  
            while(j < s.length())
            {
 
                String currentString = "";

                String currentChar = String.valueOf(s.charAt(j));

                currentString += currentChar;

                if( s.charAt(j) != ' ')
                {

                    myMap.put(pattern[i],map.getOrDefault(pattern[i],s[j]));

                    if(myMap.get(pattern.charAt(i)) == currentString)
                    {
                    i++;
                    j++;

                    continue;

                    }else
                    {
                    returnBool = false;

                    break;

                    }

                }
                
               
           
            }
             


        return returnBool;
    }
      

    }
   

    public static void main(String args[]) 
    { 
        WordPattern program = new WordPattern(); 

        boolean returnval = program.wordPatternTrueOrFalse("abba","dog cat cat dog");

        System.out.println(returnval);


    } 
} 
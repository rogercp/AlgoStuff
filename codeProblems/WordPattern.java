

import java.util.*;

// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

public class WordPattern{ 
  
    static boolean wordPatternTrueOrFalse(String pattern, String s ) 
    { 


        Map<Character,String> myMap = new HashMap<Character,String>();

        boolean returnBool = true;

        int i = 0;
       
        int j = 0;



        while(i< pattern.length())
        {
  
            StringBuilder sb = new StringBuilder();

            while(j < s.length())
            {
 
                // String currentString = "";


                // String currentChar = String.valueOf(s.charAt(j));

                // currentString += currentChar;

                sb.append(s.charAt(j));

                System.out.println(sb.toString());

                if(s.charAt(j) == ' ')
                {


                    myMap.put(pattern.charAt(i),sb.toString());

                    if(myMap.get(pattern.charAt(i)) == sb.toString())
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
             


        
    }
      
    return returnBool;
    }
   

    public static void main(String args[]) 
    { 
        WordPattern program = new WordPattern(); 

        boolean returnval = program.wordPatternTrueOrFalse("abba","dog cat cat dog");

        System.out.println(returnval);


    } 
} 
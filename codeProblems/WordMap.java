

import java.util.*;

class WordMap { 
  
   
    public Map<String,Integer> hashWordCount(String s) 
    {

        Map<String,Integer> myMap = new HashMap<String,Integer>();


        String newString = s.toLowerCase();

        int startOfWordIndex = 0;




        for(int i = 0; i< newString.length()-1; i++)
        {

            if((int)newString.charAt(i) >= 32 && (int)newString.charAt(i) <= 64)
            {


                String mySubString = newString.substring(startOfWordIndex,i-1);


                myMap.put(mySubString,myMap.getOrDefault(mySubString, 0)+1);

            }



            //  if(newString.charAt(i) == ',')
            // {

            //     String mySubString = newString.substring(startOfWordIndex,i-1);


            //     myMap.put(mySubString,myMap.getOrDefault(mySubString, 0)+1);


            //    startOfWordIndex = i+2;

            // }



            if(newString.charAt(i) == newString.length()-1)
            {

                String mySubString = newString.substring(startOfWordIndex,i);


                myMap.put(mySubString,myMap.getOrDefault(mySubString, 0)+1);


                break;

            }


                startOfWordIndex = i;

        }



        return myMap;
  

    }

    public static void main(String args[]) 
    { 
        WordMap program = new WordMap();  

        Map<String,Integer> result = program.hashWordCount("Add milk and eggs, then add flour and sugar.");

        for( Map.Entry<String,Integer> c: result.entrySet())
        {

            System.out.print(c.getKey());
            System.out.print("---");
            System.out.print(c.getValue());
            System.out.print(" ");
        }
        

       
    } 
} 
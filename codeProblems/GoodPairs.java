

import java.util.*;
import java.util.Map.*;


// Given an array of integers nums.

// A pair (i,j) is called good if nums[i] == nums[j] and i < j.

// Return the number of good pairs.

public class GoodPairs{ 
  
    static int findNumOfGoodPairs(int[] vals) 
    { 


        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();


        int counter = 0;


        for(int i = 0; i<vals.length; i++)
        {

            myMap.put(vals[i],myMap.getOrDefault(vals[i],0)+1);

        }

        for (Entry<Integer,Integer> pair : myMap.entrySet())
        {

            System.out.println(pair.getKey()+" "+pair.getValue());


            int currentval =  Math.floorDiv(pair.getValue() * (pair.getValue() - 1), 2);
                   

            counter = counter + currentval;

        }

            return counter;

    }
   

    public static void main(String args[]) 
    { 
        GoodPairs program = new GoodPairs(); 

		int[] myarr={1,2,3,1,1,3};

        int returnval = program.findNumOfGoodPairs(myarr);

        System.out.println(returnval);


        // for(int i= 0;i<twoDArr.length;i++ )
        // {
        // 	 System.out.println(twoDArr[i][0]);
        // }

       
    } 
} 
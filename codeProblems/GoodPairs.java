
import java.util.HashMap;
import java.util.*;



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

            myMap.put(vals[i],map.getOrDefault(vals[i],0)+1);

        }

        for()

// n * (n – 1) // 2 
            return counter;

    }
   

    public static void main(String args[]) 
    { 
        GoodPairs program = new GoodPairs(); 

		int[] myarr={1,2,3,1,1,3};

        int returnval = program.findNumOfGoodPairs(twoDArr);

        System.out.println(returnval);


        // for(int i= 0;i<twoDArr.length;i++ )
        // {
        // 	 System.out.println(twoDArr[i][0]);
        // }

       
    } 
} 
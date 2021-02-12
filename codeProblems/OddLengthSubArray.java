

import java.util.*;

// Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

// A subarray is a contiguous subsequence of the array.

// Return the sum of all odd-length subarrays of arr.

public class OddLengthSubArray { 
  
    static int sumOddLengthSubarrays(int[] vals) 
    {

        int accumulator = 0;
        int oddPointer = 1;


        while (oddPointer <= vals.length)
        {

        int innerPointer = 0;
        int innerAccumulator = 0;

          while(innerPointer <= oddPointer)
          {

            innerAccumulator += vals[innerPointer];

            if(vals[innerPointer] == vals[oddPointer])
            {

                innerPointer ++;

            }

          }


          oddPointer = oddPointer + 2;
          accumulator += innerAccumulator;



        }


        return accumulator;

    }



    //mathy way 
    static int sumOddLengthSubarrays2(int[] vals) 
    {

        int accumulator = 0;
        int n == vals.length;


        for(int i = 0; i<n; i++)
        {
            int left = i;
            int right = n -i-1;
            
            int odd_odd = (left+1)/2*((right+1)/2);
            int even_even = (left+2)/2*((right+2)/2);
            accumulator += arr[i] * (odd_odd +even_even);
        }
        


        return accumulator;

    }
   
   

    public static void main(String args[]) 
    { 
        OddLengthSubArray program = new OddLengthSubArray(); 

		int[] myArr={1,4,2,5,3};

        int returnval = program.sumOddLengthSubarrays(myArr);

        System.out.println(returnval);


       
    } 
} 
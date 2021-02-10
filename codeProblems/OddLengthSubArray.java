

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
        innerAccumulator = 0;

          while(innerPointer <=oddPointer)
          {

            innerAccumulator += vals[innerPointer];

          }


          oddPointer = oddPointer + 2;
          accumulator += innerAccumulator;



        }


        return accumulator;

    }
   

    public static void main(String args[]) 
    { 
        OddLengthSubArray program = new OddLengthSubArray(); 

		int[][] twoDArr={{2,8,7},{7,1,3},{1,9,5}};

        int returnval = program.findRichestCustomer(twoDArr);

        System.out.println(returnval);


       
    } 
} 
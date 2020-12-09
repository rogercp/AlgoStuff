

import java.util.*;

// Write a function that receives an array of integers and returns
// an array consisting of the product of all numbers in the array except the number at that index.

class SlidingWindowMax { 
  
   
    public int[] maxInWindow(int []intArray , int k) 
    {

        int[] newArr = new int[intArray.length - k +1];


        
        for(int i=0; i<newArr.length; i++)
        {

            int currentMax = intArray[i];

            for( int j = i; j<i+k;j++)
            {

                currentMax = Math.max(currentMax,intArray[j]);

            }

            newArr[i] = currentMax;

        }

   
        return newArr;
    
	}

    public static void main(String args[]) 
    { 

        SlidingWindowMax program = new SlidingWindowMax();

        int[] myArray = {1,3,-1,-3,5,3,6,7};

        int[] result = program.maxInWindow(myArray,3);

        for(int i =0 ; i<result.length;i++)
        {

            System.out.println(result[i]);


        }
       
    } 
} 
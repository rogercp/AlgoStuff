

import java.util.*;


// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

// Return the answer in an array.

 


public class SmallerThanCurrent{ 
  
    static int[] returnAmountOfNumsSmallerThanCurrent(int[] vals) 
    { 

        int[] returnArr = new int[vals.length];

        int[] copy = vals.clone();

        Arrays.sort(vals);  






        return copy;

    }
   

    public static void main(String args[]) 
    { 
        SmallerThanCurrent program = new SmallerThanCurrent(); 

		int[] myarr={8,1,2,2,3};

        int[] returnval = program.returnAmountOfNumsSmallerThanCurrent(myarr);

        for(int k = 0;k<returnval.length;k++)
        {

            System.out.println(returnval[k]);

        }


       
    } 
} 
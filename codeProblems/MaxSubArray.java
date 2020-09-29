
import java.util.*;


// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Example 3:

// Input: nums = [0]
// Output: 0
// Example 4:

// Input: nums = [-1]
// Output: -1
// Example 5:

// Input: nums = [-2147483647]
// Output: -2147483647

 

class MaxSubArray { 
  

    public int maxSubArray(int[] nums) 
    {

    	//set a global max to return in the end
    	 int maxSum = nums[0];
     	//set a current Sum while walking through array
         int currSum = nums[0];

         //loop through the array
        for (int i = 1; i < nums.length; i++) 
        {

	        System.out.println(maxSum+ " maxsum"); 

	        System.out.println(currSum+ " currSum");

	     	System.out.println("                   ");

	     	// we set the current sum at each iteration
	     	//we check the current number and the current sum plus the current number
	     	//whichever is bigger is the new current sum
            currSum = Math.max(nums[i], currSum + nums[i]);

            //we also look at our maxsum at each iteration 
            //to make sure we always have the biggest maxsum
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
  
    public static void main(String args[]) 
    { 
        MaxSubArray program = new MaxSubArray(); 

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4 }; 

        int returnResult = program.maxSubArray(arr);

        System.out.println(returnResult);

     
    } 
} 
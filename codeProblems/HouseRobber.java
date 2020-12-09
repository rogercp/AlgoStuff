

import java.util.*;


// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
// the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it 
// will automatically contact the police if two adjacent houses were broken into on the same night.

// Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money
//  you can rob tonight without alerting the police.

// Input: nums = [2,7,9,3,1]
// Output: 12
// Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//              Total amount you can rob = 2 + 9 + 1 = 12.


class HouseRobber { 
  
   
    public int rob(int[] nums) 
    {

        //set variable for total amount of money you can make for one iteration of robbing
         int rob = 0;
         
         //set variable for total amount of money you can make for one iteration of not robbing
         int noRob = 0;
        
        //iterate through the array of houses with the amounts
        for (int n: nums) 
        {
            //hold current amount in t
            int t = rob;
            
            //set rob to the new value 
            rob = noRob + n;
            
            //greedily check to see if the current iteration value is greater than what is already in norob
            noRob = Math.max(noRob, t);
            
        }
        
        //check to see which value is greater and return it
        return Math.max(rob, noRob);
        
    }


        
    
	
    public static void main(String args[]) 
    { 

        HouseRobber program = new HouseRobber();

        int[] myArr = {2,7,9,3,1};

        int result = program.rob(myArr);

        System.out.println(result);
       
    } 

} 
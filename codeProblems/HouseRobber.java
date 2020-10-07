

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

         int rob = 0;
         int noRob = 0;
        
        for (int n: nums) 
            
        {
            int t = rob;
            
            rob = noRob + n;
            
            noRob = Math.max(noRob, t);
            
        }
        
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
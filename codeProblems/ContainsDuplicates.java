

import java.util.*;

// Given an array of integers, find if the array contains any duplicates.

class ContainsDuplicates { 
  
   
    public boolean containsDuplicate(int[] nums) 
    {

        //create a set for the values we run accross in our array
    	Set<Integer> mySet = new HashSet<Integer>();
        
        //loop throught the array
        for(int c=0;c<nums.length;c++)
        {
            
            //check our set to see if the current c value is in there
            //if it is then return true because that means there is a duplicate
            if(mySet.contains(nums[c]))
            {
                return true;
            }
            
            //add the value to the set 
            mySet.add(nums[c]);
            
        }
        
        //if we get to this step that means that 
        //the set does not contain any duplicates so we return false
        return false;
        
    
	}

    public static void main(String args[]) 
    { 

        ContainsDuplicates program = new ContainsDuplicates();

        int[] myArr = {1,1,1,3,3,4,3,2,4,2};

        boolean result = program.containsDuplicate(myArr);

        System.out.println(result);
       
    } 
} 
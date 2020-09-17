




import java.util.*;

// Given an array of integers, find if the array contains any duplicates.

class ContainsDuplicates { 
  
   
    public boolean containsDuplicate(int[] nums) 
    {

    	Set<Integer> myMap = new HashSet<Integer>();
        
        
        for(int c=0;c<nums.length;c++)
        {
            
            if(myMap.contains(nums[c]))
            {
                return true;
            }
            
            myMap.add(nums[c]);
            
        }
        
        
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
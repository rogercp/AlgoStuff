import java.util.*;


public class TwoSum
{


    public int[] twoSum(int[] nums, int target) 
    {
      
        //create array two indexes in size for the return indexes
        int[] myReturnArr = new int[2];
        
        //create a hashmap to store numbers from nums for comparisons
        Map<Integer,Integer> mySet = new HashMap<Integer,Integer>();
        
        //iterate through the nums array
        for(int i=0; i<nums.length; i++)
        {
          // hold the current value we need in calculation variable
            int calculation = target - nums[i];

            //checking the set to see if its in there
            if(mySet.containsValue(calculation))
            {
              //if so add calculation variable to the array 
               myReturnArr[0] = calculation;
                //is so add the current value we are iterating as the second index 
                myReturnArr[1] =  nums[i];
              
                //break out of the loop because we found the value we were looking for
                break;

            }else
            {    

              //add it to the set
                mySet.put(i,nums[i]);
                
            } 
 
        }
        
        //iterate through the nums array again
        //to add the indexes instead of the number value
        for(int j = 0; j<nums.length; j++)
        {
          
            if(nums[j] == myReturnArr[0]){
                
                myReturnArr[0] = j;
    
                continue;
            }       
            else if(nums[j] == myReturnArr[1]){
                
                myReturnArr[1] = j;
                
                break;
            }

            
        }
        

        
        return myReturnArr;
        
        
            
    }

  




    public static void main(String[] args)
    {

        TwoSum program = new TwoSum();
    
        int nums[]= {2,7,11,15};

        int[] returnArr = program.twoSum(nums, 9);


        for( int c : returnArr)
        {

          System.out.println(returnArr[c]); 

        }
       


    }



}












import java.util.*;


public class TwoSum
{


    public int[] twoSum(int[] nums, int target) 
    {
      
        int[] myReturnArr = new int[2];
        
        Map<Integer,Integer> mySet = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++)
        {
            int calculation = target - nums[i];

            if(mySet.containsValue(calculation))
            {
               myReturnArr[0] = calculation;
                
                myReturnArr[1] =  nums[i];
                
                break;

            }else
            {    
                mySet.put(i,nums[i]);
                
            } 
 
        }
        
        
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












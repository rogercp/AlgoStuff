import java.util.*;



public class SearchRotatedArray
{


  public int search(int[] nums, int target) 
    {
       
       //set as bottom to 0 
        int floor= 0;
          
        //set a top to the last index in the nums length 
        int ceiling = nums.length-1;
        
        //iterate until the floor meets the ceiling
        while(floor <= ceiling) 
        {
            
            //almost the same as a binary search 
            //add the current floor to the current subtration of the ceiling and floor then divide by two 
          //this will give us the halfway point
            int halfway= floor+((ceiling-floor)/2);
            
            //short curcuit the function if we found what we need
            if(nums[halfway] == target)
            {
                return halfway;
            }
            

            //if the target is greater than or equal
           if (nums[floor] <= nums[halfway]) {
               
               //we move the ceiling to the halfway point minus one 
              if (target >= nums[floor] && target < nums[halfway]) 
                    {
                        ceiling = halfway - 1;

                    }
              else
                    {
                          floor = halfway + 1;
                    }
            }
      
          
            //if the target is less than or equal
            if (nums[halfway] <= nums[ceiling]) {
                          
                //we move the floor to the halfway point plua one and 
                if (target > nums[halfway] && target <= nums[ceiling])
                      {
                  floor = halfway + 1;
                      }
                else{
                          ceiling = halfway - 1;
                      }
                  
                  }
                  

              }
          
             
        //if the target does not exist then we return a -1
        return -1;
    }




    public static void main(String[] args)
    {

        SearchRotatedArray program = new SearchRotatedArray();
    
        int nums[]= {4,5,6,7,0,1,2};

        int returnInt = program.search(nums,0);


        System.out.println(returnInt);

    




    }



}












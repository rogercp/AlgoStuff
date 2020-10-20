import java.util.*;



public class SearchRotatedArray
{


  public int search(int[] nums, int target) 
    {
       
        int floor= 0;
            
        int ceiling = nums.length-1;
        
            
        while(floor <= ceiling) 
        {
            
            int halfway= floor+((ceiling-floor)/2);
            
            if(nums[halfway] == target)
            {
                return halfway;
            }
            
           if (nums[floor] <= nums[halfway]) {
               
              if (target >= nums[floor] && target < nums[halfway]) 
                    {
                        ceiling = halfway - 1;

                    }
              else
                    {
                          floor = halfway + 1;
                    }
            }
      
          
            if (nums[halfway] <= nums[ceiling]) {
                          
                if (target > nums[halfway] && target <= nums[ceiling])
                      {
                  floor = halfway + 1;
                      }
                else{
                          ceiling = halfway - 1;
                      }
                  
                  }
                  

              }
          
             
        
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












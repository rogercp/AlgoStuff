


import java.util.*;

// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// Return the array in the form [x1,y1,x2,y2,...,xn,yn]

public class ShuffleArray { 
  
   
    public int[] shuffle(int[] nums, int n) 
    {

		int i = 0;
        
        int j = n;
        
        int k = 0;

	    int [] myArr = new int[nums.length];
	        
	    while (j < nums.length)
	    {
	        
	        myArr[k] = nums[i];
	    
	        myArr[k+1] = nums[j];
	        
	        i++;
	        
	        j++;
	        
	        k+=2;
	    }
	        
	    return myArr;
          
    }

    public static void main(String args[]) 
    { 

        ShuffleArray program = new ShuffleArray(); 

        int[] myArr = {1,2,3,4,4,3,2,1}; 

        int[] result = program.shuffle(myArr,4);

        for( int c:result)
        {
        	System.out.println(c);
        }

       
    } 
} 
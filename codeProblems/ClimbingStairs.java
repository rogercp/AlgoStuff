


import java.util.*;

// You are climbing a stair case. It takes n steps to reach to the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


class ClimbingStairs { 
  
   
    public  int climbStairs(int n) 
    {

    	int a = 0, b = 1, temp = 0;
	        
	    for(int i = 0; i < n; i++) 
	    {
	        temp = b; 
	        b = b + a; 
	        a = temp;
	    }
	        
	    return (n > 0) ? b : 0;
        
	
    
	}

    public static void main(String args[]) 
    { 

        ClimbingStairs program = new ClimbingStairs();

        int result = program.isAnagram(45);

        System.out.println(result);
       
    } 
} 



import java.util.*;

// You are climbing a stair case. It takes n steps to reach to the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


class ClimbingStairs { 
  
   
    public  int climbStairs(int n) 
    {

    	int a = 0; 

    	int b = 1;

    	int temp = 0;
	        
	    for(int i = 0; i < n; i++) 
	    {
	    	System.out.println(a+" a");
	    	System.out.println(b+" b");
	    	System.out.println(temp+" temp");
	    	System.out.println("----------------------");

	        temp = b; 
	        b = b + a; 
	        a = temp;
	    }
	        
	    return (n > 0) ? b : 0;
        
	

	}


	//dynamic programming approach 
	//we build on top of already solved problems 
	//to solve bigger problems
	public int climbStairs1(int n) 
	{
		//if the input is zero or negative the
		//then we return zero
	    if (n <= 0)
	    {
	        return 0;
	    }


	    //we create an array the size of the amount of stairs
	    //plus one 
	    int list[] = new int[n+1];

	    //we know that the first index or index zero 
	    //represents the amount of stairs we have to climb
	    //so the amount of ways we can climb zero stairs is 
	    //1 because there is only one way to climb those stairs which is not to climb any
	    list[0] = 1;

	    //there is only one way to climb one stair as well 
	    list[1] = 1;

	    //loop through the array but we skip the first two indexes because we know the answer to those already
	    //we go until we hit n from the parameter
	    for (int i=2; i <= n; i++)
	    {

	    	//so the current index or i in our newly createed array above represents the 
	    	//stair number we are currently on
	    	//the value represents the amount of ways there are to climb to that stair
	    	//so building on top of the values we already know we check one step down with list[i-1]
	    	//and two steps down with list[i-2] because those already have the amount of ways to climb to those particular stairs
	    	//which we computed beforehand and then we simply add them together to give us our new value
	        list[i] = list[i-1] + list[i-2];


	    }

	   	//then return the value at index n which is our stair amount 
	    return list[n];
	}



	//bottom up approach as well
	public int climbStairs2(int n) 
	{
		
	    if (n <= 0)
	    {
	        return n;
	    }


	    int prevprev = 1;

	    int prev = 1;

	    int current = 0;

	    
	    for (int i=2; i <= n; i++)
	    {

	    	current = prevprev + prev;

	    	prevprev = prev;

	    	prev = current;


	    }

	    return current;
	}




    public static void main(String args[]) 
    { 

        ClimbingStairs program = new ClimbingStairs();

        int result = program.climbStairs2(6);

        System.out.println(result);
       
    } 
} 
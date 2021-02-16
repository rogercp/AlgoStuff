

import java.util.*;

// We have an array of integers, where:

// The integers are in the range 1..n1..n
// The array has a length of n+1n+1
// It follows that our array has at least one integer which appears at least twice. 
// But it may have several duplicates, and each duplicate may appear more than twice.

// Write a method which finds an integer that appears more than once in our array. 
// Don't modify the input! (If there are multiple duplicates, you only need to find one of them.)

// We're going to run this method on our new, super-hip MacBook Pro With Retina Display™. 
// Thing is, the damn thing came with the RAM soldered right to the motherboard, 
// so we can't upgrade our RAM. So we need to optimize for space!

public class DoopSpaceEd{ 




    static int findOneDoopOptimizedForTime( int[] arr) 
    { 

		Set<Integer> numbersSeen = new HashSet<>();

		    for (int number : numbers) 
		    {
		        if (numbersSeen.contains(number)) 
		        {
		            return number;
		        } else 
		        {
		            numbersSeen.add(number);
		        }
		    }

    	throw new IllegalArgumentException("no duplicate!");



    }



  
    static int findOneDoop( int[] arr) 
    { 


    }
   

    public static void main(String args[]) 
    { 
        DoopSpaceEd program = new DoopSpaceEd(); 

        int[] myArr = {2,3,4,56,3,1,2};

        int returnval = program.findOneDoop(myArr);

        System.out.println(returnval);


    } 
} 
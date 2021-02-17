

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


static int findOneDoopOptimizedForSpaceButHighTime( int[] arr) 
    { 

		for (int needle = 1; needle < numbers.length; needle++) 
		{
			
        boolean hasBeenSeen = false;

        for (int number : numbers) 

        {
            if (number == needle) 
            {
                if (hasBeenSeen) 
                {
                    return number;
                } else 
                {
                    hasBeenSeen = true;
                }
            }
        }
    }

    // whoops--no duplicate
    throw new IllegalArgumentException("no duplicate!");


    }



  
    static int findOneDoop( int[] arr) 
    { 

    	int floor = 1;
    	int ceiling = numbers.length - 1;

  		while (floor < ceiling) 
  		{


  		// divide  range 1..n into an upper range and lower range
        // (such that they don't overlap)
        // lower range is floor..midpoint
        // upper range is midpoint+1..ceiling
        int midpoint = floor + ((ceiling - floor) / 2);
        int lowerRangeFloor   = floor;
        int lowerRangeCeiling = midpoint;
        int upperRangeFloor   = midpoint + 1;
        int upperRangeCeiling = ceiling;

        // count number of items in lower range
        int itemsInLowerRange = 0;
        for (int item : numbers) 
        {

        	// is it in the lower range?
            if (item >= lowerRangeFloor && item <= lowerRangeCeiling) {
                itemsInLowerRange += 1;
            }
        }

        int distinctPossibleIntegersInLowerRange = lowerRangeCeiling - lowerRangeFloor + 1;

        if (itemsInLowerRange > distinctPossibleIntegersInLowerRange) 
        {


        	// there must be a duplicate in the lower range
            // so use the same approach iteratively on that range
            floor   = lowerRangeFloor;
            ceiling = lowerRangeCeiling;
        } else 
        {
        	// there must be a duplicate in the upper range
            // so use the same approach iteratively on that range
            floor   = upperRangeFloor;
            ceiling = upperRangeCeiling;
        }
    	}

    	//floor and ceiling have converged
    	//found a repeat
    	return floor;



    }
   

    public static void main(String args[]) 
    { 
        DoopSpaceEd program = new DoopSpaceEd(); 

        int[] myArr = {2,3,4,56,3,1,2};

        int returnval = program.findOneDoop(myArr);

        System.out.println(returnval);


    } 
} 
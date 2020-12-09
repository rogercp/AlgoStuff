






import java.util.*;

// Given a non-empty array of integers where every element appears twice except for one. 
// Find that single number. You may assume that there will always be one odd-number-out and 
// every other number in the input shows up exactly twice.

class SingleNumber { 
  
   
    public int single_number(int []arr) 
    {


    	//set up a hashset so we can dynamically check during our loop
    	//if the value is in the set
    Set<Integer> myHashSet = new HashSet<Integer>();

    //iterate through the array
    for(int c =0 ; c< arr.length;c++)
    {

    	//if the value is in the set 
    	if(myHashSet.contains(arr[c]))
    	{
    		//remove it
    		myHashSet.remove(arr[c]);

    	}else
    	{

    		//else add it to the set
    		myHashSet.add(arr[c]);

    	}

    }

    // iterate through the set
    //there should only be one item so return it
    for(int i:myHashSet)
    {
    	return i;
    }
    
    return 0;
    
	}

    public static void main(String args[]) 
    { 

        SingleNumber program = new SingleNumber();

        int[] myArray = {4, 1, 2, 1, 2};

        int result = program.single_number(myArray);

        System.out.println(result);
       
    } 
} 
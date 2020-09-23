

import java.util.*;

// In order to win the prize for most cookies sold, my friend Alice and I are going to merge our Girl Scout Cookies orders and enter as one unit.

// Each order is represented by an "order id" (an integer).

// We have our lists of orders sorted numerically already, in arrays. Write a method to merge our arrays of orders into one sorted array.

class MergeSortedArrays { 
  
   
    public int[] mergeArrays (int[] myArray, int[] alicesArray) 
    {

        //a check to see if one or both arrays are empty then
        // return the other
        if(myArray.length == 0)
        {
            return alicesArray;

        }else if( alicesArray.length == 0)
        {

            return myArray;

        }


        //create an array the length of both incoming arrays put together 
        int[] returnArr = new int[myArray.length + alicesArray.length];

        //three pointers 
        //i for the return array
        int i = 0;
        //k for myArray
        int k = 0;
        //j for alices array
        int j = 0;


        //continue a loop until we reach the the last element in our return array
        while(i < returnArr.length-1)
        {


            // check if the current element in myArray is less than or equal the
            //current element in alicesArray
            if( myArray[k] <= alicesArray[j])
            {
                // we assign the lesser value to the returnarray
                //which is the current element from myArray
                returnArr[i] = myArray[k];

                //increment counters
                i++;

                k++;

                //check to see if we are in the last iteration of the loop
                //if so we still have to push the last element to the return Array 
                //or else it wont get a chance to be added
                if(i == returnArr.length-1)
                {

                    //we are curently on the index for myArray meaning its the lesser value
                    //so that means the bigger value which is the opposite or alicesArray has not 
                    //been added yet so we add it to our return array
                    returnArr[i] = alicesArray[j];


                }

            }
            // check if the current element in myArray is less than or equal the
            //current element in alicesArray
            else if(alicesArray[j] <= myArray[k] )
            {
                // we assign the lesser value to the returnarray
                //which is the current element from alicesList
                returnArr[i] = alicesArray[j];

                //increment counters
                i++;

                j++;

                //check to see if we are in the last iteration of the loop
                //if so we still have to push the last element to the return Array 
                //or else it wont get a chance to be added
                if(i == returnArr.length-1)
                {

                    //we are curently on the index for alicesList meaning its the lesser value
                    //so that means the bigger value which is the opposite or myArray has not 
                    //been added yet so we add it to our return array
                    returnArr[i] = myArray[k];

                }

            }

        }

                


        return returnArr;
	}

    public static void main(String args[]) 
    { 

        MergeSortedArrays program = new MergeSortedArrays();

        int[] myArray = new int[]{3, 4,5, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5,5, 8, 12, 14, 19};

       int[] result = program.mergeArrays (myArray,alicesArray);


        for(int i=0; i< result.length;i++)
        {
            System.out.println(result[i]);
        }

     
       
    } 
} 
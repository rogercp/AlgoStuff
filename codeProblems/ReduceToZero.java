

import java.util.*;


// Given a non-negative integer num, return the number of steps to reduce it to zero. 
// If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.


public class ReduceToZero { 
  


    static int numberOfStepsToReduce(int val) 
    {

        int numofSteps = 0;

        int copyVal = val;

        while(copyVal != 0)
        {


            if(copyVal % 2 == 0)
            {

                copyVal = copyVal /2;

                numofSteps = numofSteps +1;

            }else
            {
                copyVal = copyVal - 1;
                numofSteps = numofSteps +1;
            }




        }




        return numofSteps;
    }
   

    public static void main(String args[]) 
    { 
        ReduceToZero program = new ReduceToZero(); 

        int returnval = program.numberOfStepsToReduce(8);

        System.out.println(returnval);


       
    } 
} 
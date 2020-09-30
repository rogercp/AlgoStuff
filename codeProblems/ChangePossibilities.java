

import java.util.*;

// Your quirky boss collects rare, old coins...

// They found out you're a programmer and asked you to solve something they've been wondering for a long time.

// Write a method that, given:

// an amount of money
// an array of coin denominations
// computes the number of ways to make the amount of money with coins of the available denominations.

public class ChangePossibilities { 
  
   
   //taking a non-recursive bottom-up approach instead of recursives top-down approach
    public int changePossibilitiesBottomUp(int amount, int[] denominations) 
    {

        //create an array with the size of the amount +1 
        //cus zero index.. 
        int[] waysOfDoingNCents = new int[amount +1];

        //set the zeroeth index to one there is one way to do the amount of zero
        waysOfDoingNCents[0] = 1;


        //iterate throught the list of denominations isolating each individual coin
        for(int coin: denominations)
        {

            // create another loop for each coin denomination and stop only 
            //when you reach the amount in the parameter
            for(int higherAmount = coin ; higherAmount <= amount ;higherAmount++)
            {

                // System.out.println(higherAmount+" higherAmount");
                //  System.out.println("---------");
                //   System.out.println(coin + " coin");
                //     System.out.println("++++++++++");




                int higherAmountRemainder = higherAmount - coin;

                                 // System.out.println(higherAmountRemainder + " higherAmountRemainder");

                                 //    System.out.println("^^^^^^^^^^^^^");


                waysOfDoingNCents[higherAmount] += waysOfDoingNCents[higherAmountRemainder];


            }


            for(int i =0; i<waysOfDoingNCents.length;i++)
            {
                System.out.println(waysOfDoingNCents[i]);
            }

            System.out.println("--------------------");

        }







        return waysOfDoingNCents[amount];


    }

    public static void main(String args[]) 
    { 
        ChangePossibilities program = new ChangePossibilities(); 

        int denominations[] = {1, 5, 10,25}; 

        int result = program.changePossibilitiesBottomUp(100,denominations);

        System.out.println(result);

       
    } 
} 
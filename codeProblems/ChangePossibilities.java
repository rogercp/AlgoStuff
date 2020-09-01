

import java.util.*;

class ChangePossibilities { 
  
   
    public static int changePossibilitiesBottomUp(int amount, int[] denominations) {

    int[] waysOfDoingNCents = new int[amount + 1];  // array of zeros from 0..amount

    waysOfDoingNCents[0] = 1;

    for (int coin : denominations) {

        for (int higherAmount = coin; higherAmount <= amount; higherAmount++) {

            int higherAmountRemainder = higherAmount - coin;

            waysOfDoingNCents[higherAmount] += waysOfDoingNCents[higherAmountRemainder];
        }
    }

    return waysOfDoingNCents[amount];
}

    public static void main(String args[]) 
    { 
        ChangePossibilities program = new ChangePossibilities(); 
        int denominations[] = { 1,3,5 }; 

        int result = program.changePossibilitiesBottomUp(5,denominations);

        

       
    } 
} 
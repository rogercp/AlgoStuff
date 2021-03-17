

import java.util.*;
import java.util.Map.*;

// Your company delivers breakfast via autonomous quadcopter drones. And something mysterious has happened.

// Each breakfast delivery is assigned a unique ID, a positive integer. When one of the company's 100 drones takes off with a 
// delivery, the delivery's ID is added to an array, deliveryIdConfirmations. When the drone comes back and lands, the ID is again
//  added to the same array.

// After breakfast this morning there were only 99 drones on the tarmac. One of the drones never made it back from a delivery. 
// We suspect a secret agent from Amazon placed an order and stole one of our patented drones. To track them down, we need to find their delivery ID.

// Given the array of IDs, which contains many duplicate integers and one unique integer, find the unique integer.

public class BreakFast{ 
  
   //O(n) runtime but also O(n) space
    public static int findUniqueDeliveryId(int[] deliveryIds) 
    {

        Map<Integer, Integer> idsToOccurrences = new HashMap<>();

        for (int deliveryId : deliveryIds) 
        {
            if (idsToOccurrences.containsKey(deliveryId)) {
                idsToOccurrences.put(deliveryId, idsToOccurrences.get(deliveryId) + 1);
            } else 
            {
                idsToOccurrences.put(deliveryId, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : idsToOccurrences.entrySet()) 
        {
        if (entry.getValue() == 1) 
        {
            return entry.getKey();
        }
    }

    return 0;
    }

    public static void main(String args[]) 
    { 
 

        BreakFast program = new BreakFast();

        int result = program.findUniqueDeliveryId();

        System.out.println(result);


       
    } 
} 
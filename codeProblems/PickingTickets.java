

import java.util.*;

// There are n people standing in line to buy show tickets.Due to high demand, the venue sells tickets according to the following rules:

// The person at the head of the line can buy exactly one ticket and must then exit the line.
// if a person needs to purchase additional tickets,they must re-enter the end of the line and wait to be sold their next ticket(assume exit and re-entry takes zero seconds).
// Each ticket sale takes exactly one second.


public class PickingTickets { 
  
    static int maxTickets(List<Integer> tickets) 
    {


        // sort arraylist of tickets first 
        Collections.sort(tickets);

        //the greatest number of tickets to buy is one 
        int greatest = 1;
        
        //the current counter when looking at a number first without any further calculation 
        //will be one 
        int currentCounter= 1;
   
        //iterate through sorting list
         for(int i =1 ; i<tickets.size(); i++)
         {
            //we are checking to see if the current number is one more than the previous or if 
            //its the same number
             if(tickets.get(i) == tickets.get(i-1)+1 || tickets.get(i) == tickets.get(i-1))
             {
                //increase the counter 
                 currentCounter++;
                 
                 //adjust the greatest variable 
                 greatest = Math.max(greatest, currentCounter);
                 
             }else
             {
                // if it doesnt hit the block above then set the current counter back to 1;
                 currentCounter = 1;
                 
                 greatest = Math.max(greatest, currentCounter);
             }
             
             
             
         }

    

        return greatest;

    }
   

    public static void main(String args[]) 
    { 
        PickingTickets program = new PickingTickets(); 


        List<Integer> myArrList = new ArrayList<Integer>();

        myArrList.add(4);
        myArrList.add(13);
        myArrList.add(2);
        myArrList.add(3);



        int val = program.maxTickets(myArrList);

        System.out.println(val);

       
    } 
} 
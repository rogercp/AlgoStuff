

import java.util.*;



public class PickingTickets { 
  
    static int maxTickets(List<Integer> tickets) 
    {


        Collections.sort(tickets);

        int greatest = 1;
        
        int currentCounter= 1;
   
    
         for(int i =1 ; i<tickets.size(); i++)
         {
             if(tickets.get(i) == tickets.get(i-1)+1 || tickets.get(i) == tickets.get(i-1))
             {
                 currentCounter++;
                 
                 greatest = Math.max(greatest, currentCounter);
                 
             }else
             {
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
import java.util.ArrayList;


// # I have two registers: one for take-out orders, and the other for the other folks eating 
// # inside the cafe. All the customer orders get combined into one list for the kitchen, where 
// # they should be handled first-come, first-served.

// # Recently, some customers have been complaining that people who placed orders after them are 
// # getting their food first. Yikes—that's not good for business!

// # To investigate their claims, one afternoon I sat behind the registers with my laptop and recorded:

// # The take-out orders as they were entered into the system and given to the kitchen. (take_out_orders)
// # The dine-in orders as they were entered into the system and given to the kitchen. (dine_in_orders)
// # Each customer order (from either register) as it was finished by the kitchen. (served_orders)


public class OrderChecker
{



    public boolean in_order_order_checker(int takeOut[], int dineIn[],int served[])
    {
       

        int takeOutIndex=0;
        int dineInIndex=0;
        int servedIndex=0;
        int servedSize = served.length - 1;

        while(servedIndex < servedSize)
        {

            boolean takeoutisnotexahsted = takeOutIndex <= takeOut.length-1;
            boolean dineinisnotexahsted = dineInIndex <= dineIn.length-1;

            if( dineinisnotexahsted == true && served[servedIndex] == dineIn[dineInIndex])
            {
                dineInIndex += 1;
                servedIndex += 1;
            }
            else if( takeoutisnotexahsted == true && served[servedIndex] == takeOut[takeOutIndex] )
            {
                takeOutIndex += 1;
                servedIndex += 1;
            }
            else
            {
                return false;
            }



        }

        return true;

       
    }





    public static void main(String[] args)
    {

        OrderChecker program = new OrderChecker();
    
        int takeOutOrders[]= {111, 13, 5615};
        int dineInOrders[]= {234, 14, 16};
        int servedOrders[]= {234,111, 5615,13, 14,16};

        System.out.println(program.in_order_order_checker(takeOutOrders,dineInOrders,servedOrders));




    }



}












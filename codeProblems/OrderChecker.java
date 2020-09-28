import java.util.ArrayList;




// My cake shop is so popular, I'm adding some tables and hiring wait staff so folks can have a cute sit-down cake-eating experience.

// I have two registers: one for take-out orders, and the other for the other folks eating inside the cafe. All the customer orders get 
// combined into one list for the kitchen, where they should be handled first-come, first-served.

// Recently, some customers have been complaining that people who placed orders after them are getting their food first. Yikes—that's not good for 
// business!

// To investigate their claims, one afternoon I sat behind the registers with my laptop and recorded:

// The take-out orders as they were entered into the system and given to the kitchen. (takeOutOrders)
// The dine-in orders as they were entered into the system and given to the kitchen. (dineInOrders)
// Each customer order (from either register) as it was finished by the kitchen. (servedOrders)


public class OrderChecker
{



    public boolean in_order_order_checker(int takeOut[], int dineIn[],int served[])
    {
       

        //if the takeout and dinein orders are not the same size as 
        //the served then we return false because their is an extra order 
        //or there is a missing order
        if( takeOut.length + dineIn.length != served.length)
        {
            return false;
        }

        //we set three variable pointers to move along each of our arrays
        int takeOutIndex=0;
        int dineInIndex=0;
        int servedIndex=0;

        // a variable for the size of the served array 
        int servedSize = served.length - 1;

        //we move along until we reach the each of our served array
        while(servedIndex < servedSize)
        {


            //another way to check to see if there are still elements in our array 
            //but we are not using these
            // boolean takeoutisnotexahsted = takeOutIndex <= takeOut.length-1;
            // boolean dineinisnotexahsted = dineInIndex <= dineIn.length-1;


            //in this block we are dealing with the dineIn array and seeing if the current index we are at for the
            //served and the dine in coincide 
            //in order for this block to run we need to have to make sure that there is still elements in 
            //the array and that the current index in the served coincides with the current index in the dine in array
            if( dineInIndex <= dineIn.length-1 && served[servedIndex] == dineIn[dineInIndex])
            {

                //we go ahead and move forward with the served and the dine in array 
                dineInIndex += 1;
                servedIndex += 1;
            }


            //in this block we are dealing with the takeout array and seeing if the current index we are at for the
            //served and the takeout coincide 
            //in order for this block to run we need to have to make sure that there is still elements in 
            //the array and that the current index in the served coincides with the current index in the takeout array
            else if( takeOutIndex <= takeOut.length-1 && served[servedIndex] == takeOut[takeOutIndex] )
            {

                //we go ahead and move forward with the served and the take our array 
                takeOutIndex += 1;
                servedIndex += 1;
            }

            //if neither of the conditions are met above 
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
    
        int takeOutOrders[]= {1, 3, 5};
        int dineInOrders[]= {2, 4, 6};
        int servedOrders[]= {1,2, 4,6, 5,3};

        System.out.println(program.in_order_order_checker(takeOutOrders,dineInOrders,servedOrders));




    }



}












import java.util.*;
import java.util.Random;


//fisher yates shuffle
public class InPlaceShuffle
{


//create random object
private static Random rand = new Random();

//create random function to return random index number
//within certain paramters
private static int getRandom(int floor, int ceiling) 
{

    // use the nextInt Random object function 
    return rand.nextInt((ceiling - floor) + 1) + floor;


}


public static void shuffle(int[] array) {

   
    if (array.length <= 1) 
    {
        return;
    }

    //go through the array
    for (int indexWeAreChoosingFor = 0;indexWeAreChoosingFor < array.length - 1; indexWeAreChoosingFor++) 
    {

        //call the getRandom function with the current index and the length of the array 
        //this ensures an unbiased permutation or that every permutation is equally likely 
        int randomChoiceIndex = getRandom(indexWeAreChoosingFor, array.length - 1);

        //so we just swap here simple swapping

        if (randomChoiceIndex != indexWeAreChoosingFor) 
        {

            int valueAtIndexWeChoseFor = array[indexWeAreChoosingFor];
            array[indexWeAreChoosingFor] = array[randomChoiceIndex];
            array[randomChoiceIndex] = valueAtIndexWeChoseFor;
        }

    }
}

    public static void main(String[] args)
    {

        InPlaceShuffle program = new InPlaceShuffle();
  
        int myArr[]= {111, 13, 5615,45,12,1234,345,45,232,63453,12,1};

        System.out.println("Before Shuffle");

        for (int i=0; i<myArr.length; i++)
        {
          System.out.println(myArr[i]);
        }


        program.shuffle(myArr);

        System.out.println("After Shuffle");

        for (int i=0; i<myArr.length; i++)
        {
          System.out.println(myArr[i]);
        }

    }



}



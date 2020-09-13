import java.util.*;
import java.util.Random;


public class InPlaceShuffle
{


private static Random rand = new Random();

private static int getRandom(int floor, int ceiling) {
    return rand.nextInt((ceiling - floor) + 1) + floor;
}


public static void shuffle(int[] array) {

   
    if (array.length <= 1) {
        return;
    }

   
    for (int indexWeAreChoosingFor = 0;
        indexWeAreChoosingFor < array.length - 1; indexWeAreChoosingFor++) {

     
        int randomChoiceIndex = getRandom(indexWeAreChoosingFor, array.length - 1);

        if (randomChoiceIndex != indexWeAreChoosingFor) {
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



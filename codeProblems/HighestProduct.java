
import java.util.*;

// class HighestProduct { 
  

//     public int highest_product_of_three(int[] inputArray)
//     {


//         if(inputArray.length < 3)
//         {
//              throw new IllegalArgumentException("Array too short");
//         }



//         double inf = Double.NEGATIVE_INFINITY;

//         // set initial integer variable to the first element in array
//         // then set the rest of the integers to the lowest possible number -infinity
//         int int1 = inputArray[0];
//         int int2 = (int)inf;
//         int int3 = (int)inf;

//         // skip first index
//         for( int i =1 ; i<inputArray.length; i++)
//         {



//             // if the current index is greater than the third biggest integer 
//             // but less than the second biggest integer
//             // then assign it to the third boiggest variable
//             if( inputArray[i] >= int3 && inputArray[i] < int2)
//             {

//                 int3 = inputArray[i];

//                 continue;

//             }

//             // if the current index is greater than the second biggest integer 
//             // but less than the biggest integer
//             // then assign it to the second biggest variable
//              if( inputArray[i] >= int2 && inputArray[i] < int1)
//             {

//                 // then shift the varibles with the lower integer value than the current index down
//                 // by re-assigning the variables
//                 int tempint2 = int2;

//                 int2 = inputArray[i];

//                 int3 = tempint2;

//                 continue;

//             }

//             // if the current index is greater than the  biggest integer 
//             // then assign it to the  biggest variable
//              if (inputArray[i]>= int1)
//             {

//                 // then shift the varibles with the lower integer value than the current index down
//                 // by re-assigning the variables
//                 int tempint1 = int1;

//                 int tempint2again = int2;

//                 int1 = inputArray[i];

//                 int2 = tempint1;

//                 int3 = tempint2again;

//                 continue;

//             }

//         }


//         //once the loop has run then return the product of the biggest integer variables
//         return int1*int2*int3;


//     }

  
//     public static void main(String args[]) 
//     { 

//         HighestProduct program = new HighestProduct();

//         int[] myArray = {4,45,2,34,-67,21,24,45,78,78,66,11,35};

//         int returnVal = program.highest_product_of_three(myArray);
       

//         System.out.println(returnVal +" Is the highest product you can get from the input");
//     } 
// } 












class HighestProduct { 
  

    public int highest_product_of_three(int[] inputArray)
    {

        if(inputArray.length < 3)
        {
           throw new IllegalArgumentException("Array too short");

        }


        //keeping track of the highest number we see
        int highest = Math.max(inputArray[0],inputArray[1]);

        //keeping track of the lowest number we see
        int lowest = Math.min(inputArray[0],inputArray[1]);


        //keeping track of the biggest output from two numbers 
        //be it two negative numbers which  become positive upon
        //multiplication or not
        int highestProductOfTwo = inputArray[0] * inputArray[1];

        //also keeping track of the lowest output from two numbers
        int lowestProductOfTwo = inputArray[0] * inputArray[1];

        //track the highest product of three numbers 
        //initially set it to the first three numbers
        int highestProductOfThree = inputArray[0] * inputArray[1] * inputArray[2];


        //skip three indexes cuz we have the highest product for those set
        for(int i = 2 ; i< inputArray.length; i++)
        {

            //hold a current value of the number
            int currentNum = inputArray[i]; 



            highestProductOfThree = Math.max(Math.max(highestProductOfThree, currentNum*highestProductOfTwo), currentNum*lowestProductOfTwo);

            highestProductOfTwo = Math.max(Math.max(highestProductOfTwo, currentNum*highest), currentNum*lowest);

            lowestProductOfTwo = Math.min(Math.min(lowestProductOfTwo, currentNum*highest), currentNum*lowest);


            highest = Math.max(highest,currentNum);

            lowest = Math.min(lowest,currentNum);





        }

       
        return highestProductOfThree;

    }

  
    public static void main(String args[]) 
    { 

        HighestProduct program = new HighestProduct();

        int[] myArray = {1, 10, -5, 1, -100};

        int returnVal = program.highest_product_of_three(myArray);
       

        System.out.println(returnVal +" Is the highest product you can get from the input");
    } 
} 
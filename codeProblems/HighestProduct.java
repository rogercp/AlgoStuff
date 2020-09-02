class HighestProduct { 
  

    public int highest_product_of_three(int[] inputArray)
    {


        if(inputArray.length < 3)
        {
            return -1;

        }



        double inf = Double.NEGATIVE_INFINITY;

        // set initial integer variable to the first element in array
        // then set the rest of the integers to the lowest possible number -infinity
        int int1 = inputArray[0];
        int int2 = (int)inf;
        int int3 = (int)inf;

        // skip first index
        for( int i =1 ; i<inputArray.length; i++)
        {



            // if the current index is greater than the third biggest integer 
            // but less than the second biggest integer
            // then assign it to the third boiggest variable
            if( inputArray[i] >= int3 && inputArray[i] < int2)
            {

                int3 = inputArray[i];

                continue;

            }

            // if the current index is greater than the second biggest integer 
            // but less than the biggest integer
            // then assign it to the second biggest variable
             if( inputArray[i] >= int2 && inputArray[i] < int1)
            {

                // then shift the varibles with the lower integer value than the current index down
                // by re-assigning the variables
                int tempint2 = int2;

                int2 = inputArray[i];

                int3 = tempint2;

                continue;

            }

            // if the current index is greater than the  biggest integer 
            // then assign it to the  biggest variable
             if (inputArray[i]>= int1)
            {

                // then shift the varibles with the lower integer value than the current index down
                // by re-assigning the variables
                int tempint1 = int1;

                int tempint2again = int2;

                int1 = inputArray[i];

                int2 = tempint1;

                int3 = tempint2again;

                continue;

            }

        }


        //once the loop has run then return the product of the biggest integer variables
        return int1*int2*int3;


    }

  
    public static void main(String args[]) 
    { 

        HighestProduct program = new HighestProduct();

        int[] myArray = {4,45,2,34,-67,21,24,45,78,78,66,11,35};

        int returnVal = program.highest_product_of_three(myArray);
       

        System.out.println(returnVal +" Is the highest product you can get from the input");
    } 
} 
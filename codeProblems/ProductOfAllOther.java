






import java.util.*;

// Write a function that receives an array of integers and returns
// an array consisting of the product of all numbers in the array except the number at that index.

class ProductOfAllOther { 
  
   
    public int[] product_of_all_other_numbers(int []intArray) 
    {


    // build an array to hold the product values
    //set to the size of the current incoming array 
    int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

    //we need an outside variable to keep track of the product up till that point
    int productSoFar = 1;
    //iterate through the original incoming array
    for (int i = 0; i < intArray.length; i++) {
        //we are looking at the running product and adding that value to our new array 
        //before the current index we are at
        productsOfAllIntsExceptAtIndex[i] = productSoFar;

        //we are looking at our running product and multiplying it by our current index value
        productSoFar *= intArray[i];
    }



    //again we need an outside variable to keep track of the product up till that point
    //the same variable as before is fine as long as we assign it to 1 cuz of the multiplication
    productSoFar = 1;
    //iterate through the original incoming array except this time we are going the opposite direction
    //to compute the product going the opposite way up intil the index
    for (int i = intArray.length - 1; i >= 0; i--) {

        //we are looking at the running product and adding that value to our new array 
        //before the current index we are at going in the opposite direction
        //except instead of just assigning to out new array we are computing the current product with the 
        //product from the left that we computed above and set into our new array
        productsOfAllIntsExceptAtIndex[i] *= productSoFar;

        // we are still looking at the running product going left so we update that
        productSoFar *= intArray[i];

    }

    return productsOfAllIntsExceptAtIndex;



    
	}

    public static void main(String args[]) 
    { 

        ProductOfAllOther program = new ProductOfAllOther();

        int[] myArray = {1, 7, 3, 4,2};

        int[] result = program.product_of_all_other_numbers(myArray);

        for(int i = 0;i<result.length;i++)
        {
            System.out.println(result[i]);

        }
       
    } 
} 
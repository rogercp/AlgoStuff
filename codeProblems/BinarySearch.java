
class BinarySearch { 
  
    int binarySearch(int arr[], int x) 
    { 

        //set the floor and the celing index pointers 
        int floor = 0;
        int ceiling = arr.length - 1; 

        //we run the loop until the floor and celing converge
        //need the < or = because there is a chance to miss the index without the =
        while (floor <= ceiling) { 


            //choose a midpoint between the current floor and current ceiling
            int middlePointBetweenFloorandCeiling = floor + (ceiling - floor) / 2; 
  
            System.out.println(arr[middlePointBetweenFloorandCeiling]);

            // Check if x is present at mid 
            if (arr[middlePointBetweenFloorandCeiling] == x) 

                return middlePointBetweenFloorandCeiling; 
  
            // If x greater, ignore left half 
            if (arr[middlePointBetweenFloorandCeiling] < x) 

                floor = middlePointBetweenFloorandCeiling + 1; 
  
            // If x is smaller, ignore right half 
            else

                ceiling = middlePointBetweenFloorandCeiling - 1; 
        } 
     
        // not present 
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 7, 9,10, 40 }; 
        int n = arr.length; 
        int x = 40; 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
    } 
} 
import java.util.*;



public class CakeTheif
{

   final int weight;
  final int value;

    public CakeType(int weight, int value) 
    {
        this.weight = weight;
        this.value  = value;
    }


    public boolean maxDuffelBagValue(int cakeTypes[], int capacity)
    {
     

    }


    //greedily approach 
    public static long maxDuffelBagValueWithCapacity1(CakeType[] cakeTypes) {

    long maxValueAtCapacity1 = 0L;

    for (CakeType cakeType : cakeTypes) {
        if (cakeType.weight == 1) {
            maxValueAtCapacity1 = Math.max(maxValueAtCapacity1, cakeType.value);
        }
    }

    return maxValueAtCapacity1;
}

  public static long maxDuffelBagValue(CakeType[] cakeTypes, int weightCapacity) {

    long[] maxValuesAtCapacities = new long[weightCapacity + 1];

    for (int currentCapacity = 0; currentCapacity <= weightCapacity; currentCapacity++) {

        long currentMaxValue = 0;

        for (CakeType cakeType : cakeTypes) {

       
            if (cakeType.weight <= currentCapacity) {

            
                long maxValueUsingCake = cakeType.value
                    + maxValuesAtCapacities[currentCapacity - cakeType.weight];

            
                currentMaxValue = Math.max(maxValueUsingCake, currentMaxValue);
            }
        }

       
        maxValuesAtCapacities[currentCapacity] = currentMaxValue;
    }


}


public static long maxDuffelBagValueComm(CakeType[] cakeTypes, int weightCapacity) {

    // we make an array to hold the maximum possible value at every
    // duffel bag weight capacity from 0 to weightCapacity
    // starting each index with value 0
    long[] maxValuesAtCapacities = new long[weightCapacity + 1];

    for (int currentCapacity = 0; currentCapacity <= weightCapacity; currentCapacity++) {

        // set a variable to hold the max monetary value so far for currentCapacity
        long currentMaxValue = 0;

        for (CakeType cakeType : cakeTypes) {

            // if a cake weighs 0 and has a positive value the value of our duffel bag is infinite!
            if (cakeType.weight == 0 && cakeType.value != 0) {
                throw new InfinityException();
            }

            // if the current cake weighs as much or less than the current weight capacity
            // it's possible taking the cake would get a better value
            if (cakeType.weight <= currentCapacity) {

                // so we check: should we use the cake or not?
                // if we use the cake, the most kilograms we can include in addition to the cake
                // we're adding is the current capacity minus the cake's weight. we find the max
                // value at that integer capacity in our array maxValuesAtCapacities
                long maxValueUsingCake = cakeType.value
                    + maxValuesAtCapacities[currentCapacity - cakeType.weight];

                // now we see if it's worth taking the cake. how does the
                // value with the cake compare to the currentMaxValue?
                currentMaxValue = Math.max(maxValueUsingCake, currentMaxValue);
            }
        }

        // add each capacity's max value to our array so we can use them
        // when calculating all the remaining capacities
        maxValuesAtCapacities[currentCapacity] = currentMaxValue;
    }

    return maxValuesAtCapacities[weightCapacity];
}


    public static void main(String[] args)
    {

        CakeType[] cakeTypes = new CakeType[]
         {
          new CakeType(7, 160),
          new CakeType(3, 90),
          new CakeType(2, 15),
          };

        CakeTheif program = new CakeTheif();
    
        int movietimes[]= {23,456,100,23423,130,34,465};

        System.out.println(program.can_two_movies_fill_flight(movietimes,230));




    }



}


 









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


 









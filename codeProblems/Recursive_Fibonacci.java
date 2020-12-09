import java.util.*; 
import java.util.ArrayList;



public class Recursive_Fibonacci
{



//this is our memoization 
   private  Map<Integer, Integer> memoFib = new HashMap<Integer, Integer>(); 



    public int recurse_fib(int n)
    {

        //our base case here 
        //return n when its 1 or less than one
        if(n <=1 )
        {
            return n;

        }

        //check the memooization hashtable
        if(memoFib.containsKey(n))
        {
            //return if it exists therefore not needing to compute
            return memoFib.get(n);

        }
        

        //else if its not in our hashmap then we compute 
       int result = recurse_fib(n-1) + recurse_fib(n-2);

        System.out.println(memoFib);
        //then subsequently add it to our hashmap
        memoFib.put(n,result);


        return result;
    }





    public static void main(String[] args)
    {

        Recursive_Fibonacci program = new Recursive_Fibonacci();
    
        System.out.println(program.recurse_fib(400));





    }



}












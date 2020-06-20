import java.util.*; 
import java.util.ArrayList;



public class Recursive_Fibonacci
{



   private  Map<Integer, Integer> memoFib = new HashMap<Integer, Integer>(); 



    public int recurse_fib(int n)
    {


        if(n <=1 )
        {
            return n;

        }


        if(memoFib.containsKey(n))
        {
            return memoFib.get(n);

        }
        

        int result = recurse_fib(n-1) + recurse_fib(n-2);

        System.out.println(memoFib);

        memoFib.put(n,result);


        return result;
    }





    public static void main(String[] args)
    {

        Recursive_Fibonacci program = new Recursive_Fibonacci();
    
        System.out.println(program.recurse_fib(10));





    }



}












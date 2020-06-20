import java.lang.Math;
import java.util.ArrayList;



public class Recursive_Factorial
{



    public int recurse_fact(int n)
    {
        if(n == 1)
        {
            return n;
        }


        return n * recurse_fact(n-1);

    }





    public static void main(String[] args)
    {

        Recursive_Factorial program = new Recursive_Factorial();
    
        System.out.println(program.recurse_fact(5));


        // Calll Stack///////

        //  5 * recurs_fact (5-1)—>120 —>answer
        //         ^
        //     evaluates 24

        //      4 * recurs_fact (4-1)—>24
        //                ^
        //         evaluates 6

        //             3 * recurs_fact (3-1)—> 6
        //                         ^
        //                     evaluates 2

        //                  2 * recurs_fact(2-1) —> 2
        //                          ^
        //                          returns 1 <-baseCase



    }



}












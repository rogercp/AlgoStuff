  import java.util.Map;
import java.util.HashMap;

public class MemoFib {

    private Map<Integer, Integer> memo = new HashMap<>();


    public int fib(int n) {

        // edge case: negative index
        if (n < 0) {
            throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
        }

        // base case: 0 or 1
        else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fib(n - 1) + fib(n - 2);

        // memoize
        memo.put(n, result);

        return result;
    }


//bottom up non recursive approach
  public static int bestFib(int n) {

    // edge cases:
    if (n < 0) {
        throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
    } else if (n == 0 || n == 1) {
        return n;
    }

    // we'll be building the fibonacci series from the bottom up
    // so we'll need to track the previous 2 numbers at each step
    int prevPrev = 0;  // 0th fibonacci
    int prev = 1;      // 1st fibonacci
    int current = 0;   // Declare and initialize current

    for (int i = 1; i < n; i++) {
 
        // Iteration 1: current = 2nd fibonacci
        // Iteration 2: current = 3rd fibonacci
        // Iteration 3: current = 4th fibonacci
        // To get nth fibonacci ... do n-1 iterations.
        current = prev + prevPrev;
        prevPrev = prev;
        prev = current;
    }

    return current;
}

    public static void main(String[]args)
    {


        MemoFib program = new MemoFib();

        // int result = program.fib(45);

        // System.out.println(result);

        int result = program.bestFib(45);

        System.out.println(result);

        

    }

}
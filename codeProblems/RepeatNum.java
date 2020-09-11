

class RepeatNum { 
  


    public static int findRepeat(int[] numbers) {

    if (numbers.length < 2) {
        throw new IllegalArgumentException("Finding duplicate requires at least two numbers");
    }

    int n = numbers.length - 1;

    int sumWithoutDuplicate = (n * n + n) / 2;

    int actualSum = 0;
    for (int number : numbers) {
        actualSum += number;
    }

    return actualSum - sumWithoutDuplicate;
}
  
    public static void main(String args[]) 
    { 

        RepeatNum program = new RepeatNum();



        program.findRepeat();

    } 
} 
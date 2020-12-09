import java.util.ArrayList;

// Write a function that takes a list of characters and reverses the letters in place. 


public class StringReverse
{



    public void string_reverse_in_place(char s[])
    {
       
        // assign two indexes
        // the first and the last element in the array
        int left_index = 0;
        int right_index = s.length-1;


        // loop through each index until the left meets the right 
        while(left_index < right_index)
        {

            // assign a temporary variable for the current index
            char temp = s[right_index];

            // flip or switch the index values from the current right and left indexes
            s[right_index] = s[left_index];
            s[left_index] = temp;

            // increment the pointer index for the left to keep moving forward
            // decrement the pointer index for the right to keep moving backward
            left_index = left_index + 1;
            right_index = right_index - 1;

        }
    }





    public static void main(String[] args)
    {

        StringReverse program = new StringReverse();
    
        char myList[] = {'h','i','s','t','o','r','y'};
        
        System.out.println(myList);

        // done in place no need for a return 
        program.string_reverse_in_place(myList);


        System.out.println(myList);




    }



}












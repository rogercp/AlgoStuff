import java.util.ArrayList;

// Write a function that takes a list of characters and reverses the letters in place. 


public class StringReverse
{



    public void string_reverse_in_place(char s[])
    {
       
        int left_index = 0;
        int right_index = s.length-1;


        while(left_index < right_index)
        {
            char temp = s[right_index];
            s[right_index] = s[left_index];
            s[left_index] = temp;

            left_index = left_index + 1;
            right_index = right_index - 1;

        }
    }





    public static void main(String[] args)
    {

        StringReverse program = new StringReverse();
    
        char myList[] = {'h','i','s','t','o','r','y'};
        
        System.out.println(myList);

        program.string_reverse_in_place(myList);

        System.out.println(myList);




    }



}












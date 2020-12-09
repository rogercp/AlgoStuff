import java.util.*;


//first reverse the word 
//then reverse the characters in the words and reverse the order of the words

  public class StringManipulation {




    //reversing a string set as an array 
    //in java strings are immutable
    public void reverseString(char s[])
    {

        //two pointers beginning and end
        int left = 0;

        int right = s.length-1;

        //loop until the left overtakes the right
        while(left < right)
        {

            //set a temporary variable be because we will overwrite it
            char temp = s[left];

            //set the left index to the right one 
            s[left] = s[right];

            //set the right index to the left one or the temp one 
            s[right]= temp;

            //increment the the pointers or decrement
            left ++;

            right --;
        }


    }



   //overloaded method
    public void reverseString(char s[], int leftIndex, int rightIndex)
    {


        while(leftIndex < rightIndex)
        {

            //set a temporary variable be because we will overwrite it
            char temp = s[leftIndex];

            //set the left index to the right one 
            s[leftIndex] = s[rightIndex];

            //set the right index to the left one or the temp one 
            s[rightIndex]= temp;

             //increment the the pointers or decrement
            leftIndex ++;

            rightIndex --;
        }




    }





    public void reverseWords(char s[])
    {

        //
        int startOfSubStringIndex = 0;

        //walk through the whole array of characters
        for(int i=0; i<s.length; i++)
        {

            //if we hit an empty space character or the end of the array 
            //we run this block
            if(s[i] == ' ' || i == s.length-1)
            {

                //if its not the end of the array 
                //meaning its an empty space character
                if(i != s.length-1)
                {
                    //we reverse the substring by sending it to another method
                    this.reverseString(s,startOfSubStringIndex,i-1);

                    //after we increase the start of the substring variable 
                    //skipping the empty space 
                     startOfSubStringIndex = i+1;
                }
                //if its the end of the array
                else
                {
                    //we reverse the substring by sending it to another method
                    //here there is no need to increase the substring variable because 
                    //we reached the end 
                    this.reverseString(s,startOfSubStringIndex,i);
                }
                
            }


        }

        //we reverse it one last time to get the correct order of the characters
        this.reverseString(s);


    }




    public static void main(String[] args)
    {




        StringManipulation program = new StringManipulation();

        char[] message = { 'c', 'a', 'k', 'e', ' ',
                   'p', 'o', 'u', 'n', 'd', ' ',
                   's', 't', 'e', 'a', 'l' };

        char []myCharacters = {'h','e','l','l','o'};

        program.reverseString(myCharacters);

        program.reverseWords(message);

        System.out.println(message);

        System.out.println(myCharacters);



      
        




    }



}













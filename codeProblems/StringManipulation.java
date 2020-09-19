import java.util.*;


//first reverse the word 
//then reverse the characters in the words and reverse the order of the words

  public class StringManipulation {





    public void reverseWords(char s[])
    {


        int startOfSubStringIndex = 0;

        for(int i=0; i<s.length; i++)
        {

            if(s[i] == ' ' || i == s.length-1)
            {

                if(i != s.length-1)
                {
                    this.reverseString(s,startOfSubStringIndex,i-1);
                     startOfSubStringIndex = i+1;
                }else
                {
                    this.reverseString(s,startOfSubStringIndex,i);
                }
                



            }


        }

        this.reverseString(s);


    }




    public void reverseString(char s[], int leftIndex, int rightIndex)
    {


        while(leftIndex < rightIndex)
        {

            char temp = s[leftIndex];

            s[leftIndex] = s[rightIndex];


            s[rightIndex]= temp;


            leftIndex ++;

            rightIndex --;
        }




    }




    public void reverseString(char s[])
    {

        int left = 0;

        int right = s.length-1;


        while(left < right)
        {

            char temp = s[left];

            s[left] = s[right];


            s[right]= temp;


            left ++;

            right --;
        }


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













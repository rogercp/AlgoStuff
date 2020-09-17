

import java.util.*;



public class PalindromeLongest
{


	public int lengthOfLongestPalindrome(String s) 
	{
        
   		ArrayList<Character> myArrayList = new ArrayList<Character>();

   		for(int i=0; i<s.length(); i++)
   		{

   			myArrayList.add(s.charAt(i));

   		}

   		
   		int i = 0;
   		int j = 1;

   		

   		return myArrayList.size();

    }



	public static void main(String[]args)
	{


		PalindromeLongest program = new PalindromeLongest();

		System.out.println(program.lengthOfLongestPalindrome("BANANA"));



	}
}




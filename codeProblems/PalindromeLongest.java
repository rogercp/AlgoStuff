

import java.util.*;

//given a string s find the longest palindrome substring in s. 

public class PalindromeLongest
{


	public String lengthOfLongestPalindrome(String s) 
	{
        
        //return an empty string is there is no string or the string is less than 1 
   		if (s==null || s.length() < 1 ) 
   			{
   				return "";
			}


		//we have two variables for starting and ending indexes
   		int start = 0;
   		int end = 0;

   		//loop through the string
   		for(int i=0;i<s.length();i++)
   		{

   			//isolate that one character 
   			//send one to the helper function for those substrings where the index starts at the same place such ass racecar the "e"
   			//send one the the helper function for those substring where the index starts at two different indexes such ass abba "b","b"
   			//hold the return value for both calls of how long the length is when using the helper function
   			int len1 = expandFromMiddle(s,i,i);
   			int len2 = expandFromMiddle(s,i,i+1);


   			//we dont know which case we are guna hit so we need both lengths and get the longer
   			//we compare those two returns and keep the biggest one
   			int len = Math.max(len1,len2);

   			//if that length is greater than the start and end indexes
   			//if the return length of the computed palindrome at the character position is not longer the one we current hold with the 
   			//start and end indexes then disregard
   			if(len > end - start)
   			{
   				//we compute new indexes for the start and and end of the new 
   				//longest palindrome at the current character
   				// we take that length and divide it by two subtracted from the current character index to get the left side of the palindrome start index
   				//we take that length and divide it by two added from the current character index to get the right side of hte palindrome end index
   				start = i - ((len-1)/2);
   				end = i + (len/2);

   			}

   		}
   		//we use the substring string method to get the substring at the two indexes
   		//dealing with indexes so +1
   		return s.substring(start,end+1);
    }



    public int expandFromMiddle(String s,int left, int right)
    {

    	// if string is nothing or the left index is greater than the right the return 0
    	if(s == null || left >right) return 0;

    	//here we are staying in a loop if and only if all these conditions are met
    	//for the left index we keep going if we do not reach the begining of the string
    	//for the right index we keep going if we do not reach the end of the string
    	//we keep going if only if the characters are equal to each other while expanig outward
    	while(left >= 0 && right <=s.length()-1 && s.charAt(left) == s.charAt(right))
    	{

    		//decrement or increment the pointer at each iteration
    		left--;
    		right++;

    	}

    	//we return the difference between the pointers 
    	//this gives us the size of the substring that is a palindrome
    	//dealing with indexes so +1
    	return (right) - (left+1);


    } 

	public static void main(String[]args)
	{


		PalindromeLongest program = new PalindromeLongest();

		// System.out.println(program.lengthOfLongestPalindrome("babab"));
		// System.out.println(program.lengthOfLongestPalindrome("bb"));
		// System.out.println(program.lengthOfLongestPalindrome("racecar"));
		System.out.println(program.lengthOfLongestPalindrome("babmadamab"));



	}
}




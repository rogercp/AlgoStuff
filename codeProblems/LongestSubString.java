
import java.util.*;


// Given a string s, find the length of the longest substring without repeating characters.

public class LongestSubString
{


	public int lengthOfLongestSubstring(String s) {
        
    // set a maximum var for the length of the longest substring 
	// set two pointers I and J
	// I is the slow pointer and J is the faster one
    int i=0, j=0, max = 0;

	//hashset to keep track of if the character has shown up 
    Set<Character> mySet = new HashSet<>();

    // iterate with the quickest pointer till the end of the string 
    while(j < s.length())
    {

    	// if the set does not contain the current character at pointer j 
    	// then add it to the set while incrementing the J pointer 
    	//also adjust your max variable with the current size of your set
    	if(!mySet.contains(s.charAt(j)))
    	{
    		mySet.add(s.charAt(j++));
    		max = Math.max(max,mySet.size());
    	}
    	// if the character is already in the set then remove the first occurance 
    	//with the first pointer then increment the first pointer 
    	else
    	{
    		mySet.remove(s.charAt(i++));
    	}

    }


	return max;

    }



	public static void main(String[]args)
	{


		LongestSubString program = new LongestSubString();

		System.out.println(program.lengthOfLongestSubstring("ABRAVAXR"));

		// System.out.println(program.lengthOfLongestSubstring("bbbbb"));

		// System.out.println(program.lengthOfLongestSubstring("pwwkew"));

		// System.out.println(program.lengthOfLongestSubstring("au"));

		// System.out.println(program.lengthOfLongestSubstring(""));

		// System.out.println(program.lengthOfLongestSubstring("      "));

		// System.out.println(program.lengthOfLongestSubstring(" "));


	}
}




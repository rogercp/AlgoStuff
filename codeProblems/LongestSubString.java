
import java.util.*;


// Given a string s, find the length of the longest substring without repeating characters.

public class LongestSubString
{


	public int lengthOfLongestSubstring(String s) {
        
    int i=0, j=0, max = 0;

    Set<Character> mySet = new HashSet<>();

    while(j < s.length())
    {

    	if(!mySet.contains(s.charAt(j)))
    	{
    		mySet.add(s.charAt(j++));
    		max = Math.max(max,mySet.size());
    	}else
    	{
    		mySet.remove(s.charAt(i++));
    	}

    }

	return max;

    }



	public static void main(String[]args)
	{



		LongestSubString program = new LongestSubString();

		System.out.println(program.lengthOfLongestSubstring("abcabcbb"));

		System.out.println(program.lengthOfLongestSubstring("bbbbb"));

		System.out.println(program.lengthOfLongestSubstring("pwwkew"));

		System.out.println(program.lengthOfLongestSubstring("au"));

		System.out.println(program.lengthOfLongestSubstring(""));

		System.out.println(program.lengthOfLongestSubstring("      "));

		System.out.println(program.lengthOfLongestSubstring(" "));


	}
}




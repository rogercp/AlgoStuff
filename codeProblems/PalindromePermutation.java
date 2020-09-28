import java.util.*; 



// Write an efficient method that checks whether any permutation  of an input string is a palindrome. 

// You can assume the input string only contains lowercase letters.

public class PalindromePermutation
{


	public boolean has_permuation(String the_string)
	{


       //use a set to check if there is only one letter left when the string 
       //finishes looping that way we know that there is in fact at least one permutation of 
       //a palindrome
       Set<Character> unpaired_character = new HashSet<>();


       //loop throught the string
       for( int i = 0 ; i< the_string.length();i++)
       {      

                     //if the character is in the set then we remove it
       		if( unpaired_character.contains(the_string.charAt(i)))
       		{
       			unpaired_character.remove(the_string.charAt(i));
       		}
                     //or we add it if its not
                     //this also means that any odd number of characters will
                     //leave one chracter in the set
       		else
       		{
       			unpaired_character.add(the_string.charAt(i));
       		}

       }

       //if there is only one chracter left in the set that means 
       //that we have the abolity to make a permutation of a palindrome 
       //so we return false or true here  
       return unpaired_character.size() == 1;


	}



	public static void main (String[] args)
	{


		PalindromePermutation program = new PalindromePermutation();

		boolean returnVal = program.has_permuation("ivicc");

		System.out.println(returnVal);



	}
}
import java.util.*; 


public class PalindromePermutation
{


	public boolean has_permuation(String the_string)
	{


       
       Set<Character> unpaired_character = new HashSet<>();


       for( int i = 0 ; i< the_string.length();i++)
       {

       		if( unpaired_character.contains(the_string.charAt(i)))
       		{
       			unpaired_character.remove(the_string.charAt(i));
       		}
       		else
       		{
       			unpaired_character.add(the_string.charAt(i));
       		}

       }

       return unpaired_character.size() == 1;


	}



	public static void main (String[] args)
	{


		PalindromePermutation program = new PalindromePermutation();

		boolean returnVal = program.has_permuation("ivicc");

		System.out.println(returnVal);



	}
}
import java.util.*;




public class RotationPoint
{


//accomplishes in O(n*lengthOfWord) or O(n) simplified
  public static int findRotationPoint(String[] words) 
  {
   

  	// grab that first word
  	String returnString = words[0];

  	//create the index you will return
  	int returnIndex = 0;


  	//loop through list of words
  	for( int i =1; i< words.length; i++)
  	{

  		//hold current word
  		String current = words[i];

  		//if the first character of that word is less or equivalent to the
  		//one held by the variable outside the loop then go into the if statement
  		if( words[i].charAt(0) <= returnString.charAt(0))
  		{	
  				
  			//create a pointer to traverse word for the outside word
  			int pointerForOutSideWord = 0;

  			//loop throught the current word and the outside word
  			for(int j =0; j<current.length();j++)
  			{
  				

  					//check the letters at the current indxes to see if the current one is less than the outside one
  					if(current.charAt(j) < returnString.charAt(pointerForOutSideWord))
  					{

  						//if so change the return string to the current string
  						returnString = current;

  						// also set the return index 
  						returnIndex = i;

  						//break out of the loop 
  						break;

  					}else
  					{
  						//increment the pointer of the outside word if the current letter is not less than the current
  						//letter of the outside word
  						pointerForOutSideWord++;


  					}


  			}


  		}



  	}

  	return returnIndex;



  }


  //accomplishes in O(logn) faster than above
  public static int findRotationPointBinarySearch(String[] words) 
  {

  		//final keyword means it can only be assigned initally and cannot be 
  		//reassigned 
  		//we are holding the first word here
	  	final String firstWord = words[0];

	  	//create two indexes a beginning and 
	  	//one for the end or the size of the words array
	    int floorIndex = 0;
	    int ceilingIndex = words.length - 1;

	    //loop through until the floorindex meets the cieling index
	    //this is just a modified binary search
	    while (floorIndex < ceilingIndex) {


	    	//halfwaypoint between the current ceiling index and the current floor index
	        int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);

	        System.out.println("guessindex---");
	        System.out.println(words[guessIndex]);

//*compareTo method looks at each string letter per letter and if you have two words like ape nad apple it makes the comparison at the 
// first instance it can which would be the e and the p	and either returns a positive or negative number 

	        //lexographically if the guessindex word is after the first word or quals the first word alphabetically
	        //do the block you get a positive numbers 
	        if (words[guessIndex].compareTo(firstWord) >= 0) {

	        	System.out.println("if---");
	        	System.out.println(words[guessIndex]);

	        	//we move the new floor index to what is now the halfway point 
	        	//because it is not alphabetically before the current word 
	            floorIndex = guessIndex;

	        } 

	        //lexographically if the guessindex word is before the first word alphabetically
	        //do the block you get a negative number
	        else {

			System.out.println("else---");
	       	 System.out.println(words[guessIndex]);

	       	 	//we move the new cieling to be our current word 
	            ceilingIndex = guessIndex;
	        }


	        //checking to see if we are getting close the convergence of floor and cieling indexes
	        //if so break and return the current cieling
	        if (floorIndex + 1 == ceilingIndex) {

	        System.out.println("last block ran---");
	   
	            break;
	        }

	    }

	    return ceilingIndex;


  }




	public static void main(String[]args)
	{

				
		String[] words = new String[]{
		  "ptolemaic", "retrograde", "supplant", "undulate", "xenoepist",
            "asymptote", "babka",
		};

		RotationPoint program = new RotationPoint();

		int result = program.findRotationPointBinarySearch(words);


		System.out.println(result);
	}



}





























 
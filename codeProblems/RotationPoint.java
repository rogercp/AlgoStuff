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

	  	final String firstWord = words[0];

	    int floorIndex = 0;

	    int ceilingIndex = words.length - 1;

	    while (floorIndex < ceilingIndex) {

	        int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);

	        if (words[guessIndex].compareTo(firstWord) >= 0) {
	            floorIndex = guessIndex;
	        } else {
	            ceilingIndex = guessIndex;
	        }

	        if (floorIndex + 1 == ceilingIndex) {

	   
	            break;
	        }
	    }

	    return ceilingIndex;


  }




	public static void main(String[]args)
	{

				
		String[] words = new String[]{
		  "ptolemaic", "retrograde", "supplant", "undulate", "xenoepist",
            "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage"
		};

		RotationPoint program = new RotationPoint();

		int result = program.findRotationPoint(words);


		System.out.println(result);
	}



}





























 
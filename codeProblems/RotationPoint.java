import java.util.*;




public class RotationPoint
{


  public static int findRotationPoint(String[] words) {
    final String firstWord = words[0];

    int floorIndex = 0;
    int ceilingIndex = words.length - 1;

    while (floorIndex < ceilingIndex) {

        // guess a point halfway between floor and ceiling
        int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);

        // if guess comes after first word or is the first word
        if (words[guessIndex].compareTo(firstWord) >= 0) {
            // go right
            floorIndex = guessIndex;
        } else {
            // go left
            ceilingIndex = guessIndex;
        }

        // if floor and ceiling have converged
        if (floorIndex + 1 == ceilingIndex) {

            // between floor and ceiling is where we flipped to the beginning
            // so ceiling is alphabetically first
            break;
        }
    }

    return ceilingIndex;
}

	public static void main(String[]args)
	{

				
		String[] words = new String[]{
		    "ptolemaic",
		    "retrograde",
		    "supplant",
		    "undulate",
		    "xenoepist",
		    "asymptote",  // <-- rotates here!
		    "babka",
		    "banoffee",
		    "engender",
		    "karpatka",
		    "othellolagkage",
		};

		RotationPoint program = new RotationPoint();

		int result = program.findRotationPoint(word);


		System.out.println(result)
	}



}
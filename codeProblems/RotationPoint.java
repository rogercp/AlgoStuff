import java.util.*;




public class RotationPoint
{


  public static int findRotationPoint(String[] words) {
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

// Each round, players receive a score between 0 and 100, which you use to rank them from highest to lowest. 
// So far you're using an algorithm that sorts in O(n\lg{n})O(nlgn) time, but players are complaining that their rankings aren't updated fast enough. 
// You need a faster sorting algorithm.

import java.util.*;




public class ScoreSort
{


	public int[] sortScores(int[] unorderedScores, int highestPossibleScore) 
	{


		// create array using the highest possible score with 
		// a plus 1 index 	
		int[] otherArr = new int[highestPossibleScore+1];

		//the final array we are to return 
		//of size unorderedScores
		int[] scoreCount = new int[unorderedScores.length];

		//populate the otherarr using the index as the key and the count of the score 
		//increasing the actual values based on how many times the the score shows up
		for(int i =0; i< unorderedScores.length; i++)
		{

			otherArr[unorderedScores[i]] = otherArr[unorderedScores[i]] += 1;

		}

		//create a counter for scoreCount
		int counterForScoreCount = 0;

		//move backwards through the otherarray with the populated indexes
		for(int j = otherArr.length-1; j>0; j-- )
		{
			//grab the current value for the array
			int currentValueForIndex = otherArr[j];

			//run the while loop if the array is over 0
			while(currentValueForIndex > 0)
				{

					//adding index not the value to the scoreCount array
					scoreCount[counterForScoreCount] = j;

					//reducing the current value we grabbed above by one 
					//to take care of multiple same scores
					currentValueForIndex = otherArr[j] -= 1 ;

					//increase the score for the scoreCount array
					counterForScoreCount++;

				}
			


		}

		return scoreCount;


	    
	}




	public static void main(String[]args)
	{

		int[] unsortedScores = {37, 89, 41, 65, 91, 53};
		int highestScorePossible = 100;


		ScoreSort program = new ScoreSort();

		int[] returnVal = program.sortScores(unsortedScores,highestScorePossible);


		for(int k = 0; k < returnVal.length; k++)
		{

			System.out.println(returnVal[k]);
		}





	}
}




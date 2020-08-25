
// Each round, players receive a score between 0 and 100, which you use to rank them from highest to lowest. 
// So far you're using an algorithm that sorts in O(n\lg{n})O(nlgn) time, but players are complaining that their rankings aren't updated fast enough. 
// You need a faster sorting algorithm.

import java.util.*;




public class ScoreSort
{



	public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

	    int[] scoreCounts = new int[highestPossibleScore + 1];

	    for (int score : unorderedScores) {
	        scoreCounts[score]++;
	    }

	    int[] sortedScores = new int[unorderedScores.length];
	    int currentSortedIndex = 0;

	    for (int score = highestPossibleScore; score >= 0; score--) {
	        int count = scoreCounts[score];

	        for (int occurrence = 0; occurrence < count; occurrence++) {

	            sortedScores[currentSortedIndex] = score;
	            currentSortedIndex++;
	        }
	    }

	    return sortedScores;
	}




	public static void main(String[]args)
	{

		int[] unsortedScores = {37, 89, 41, 65, 91, 53};
		int highestScorePossible = 100;


		ScoreSort program = new ScoreSort();

		int[] returnVal = program.sortScores(unsortedScores,highestScorePossible);


		for(int j = 0; j < returnVal.length; j++)
		{

			System.out.println(returnVal[j]);
		}





	}
}




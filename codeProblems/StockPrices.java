import java.util.*;


// find the biggest profit between the values you must buy before selling


public class StockPrices
{



	public int get_biggest_profits(int[]values)
	{


	
		if(values.length < 2)
		{

			throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
		}

		// craete minimum price which we need it to be in order to get the most profit
		// initialize that to the first index
		int minPrice = values[0];

		//initially our max profit is index one minus index zero
		int maxProfit = values[1] - values[0];


		//loop through the values array
		//we should set the first i value to index one because
		//we need to sell after we buy
		for( int i =1 ; i< values.length; i++)
		{

			//hold the current value we are looking at in a variable
			int currentPrice = values[i];

			// this is the greedy part of the algorithms
			// we are holding the potential profit of the current index minus the
			//minprice
			int potentialProfit = currentPrice - minPrice;	

			// then we can decide here to use that variable or not based on it works out
			// in favor for us 
			maxProfit = Math.max(maxProfit, potentialProfit);

			//we still need to keep the minPrice as low as we can get it
			// we check to see if the current price is lower than the one 
			//we already have
			minPrice = Math.min(minPrice, currentPrice); 

		}

		return maxProfit;


	}





	public static void main(String[]args)
	{

		int[] prices = {9, 7, 4, 1};

		StockPrices program = new StockPrices(); 

		int returnVal = program.get_biggest_profits(prices);

		System.out.println(returnVal);

	}



}
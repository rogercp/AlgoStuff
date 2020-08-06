import java.util.*;


// find the biggest profit between the values you must buy before selling


public class StockPrices
{



	public int get_biggest_profits(int[]values)
	{

		if( values.length < 2)
		{
			System.out.println("Getting a profit requires at least 2 values.");
		}

		int min_price = values[0];
		int max_profit = values[1] - values[0];

		for(int i = 1; i<values.length ;i++)
		{

			int current_price = values[i];
			int potential_profit = current_price - min_price;

			if(max_profit < potential_profit)
			{
				max_profit = potential_profit;
			}

			if(min_price > current_price)
			{
				min_price = current_price;
			}

		}

		return max_profit;

	}





	public static void main(String[]args)
	{

		int[] prices = {10, 7, 5, 8, 11, 9,45,67,23,7,9,234,567,323,1};

		StockPrices program = new StockPrices(); 

		int returnVal = program.get_biggest_profits(prices);

		System.out.println(returnVal);

	}



}
package com.latitude.challenge.stockmarket;

/**
 * @author Diego
 * 
 * Latitude Challenge Solution
 * Complexity: O(N)
 * 
 */

public class MaxProfit {
	
	public static long getMaxProfit(int[] stockPrices) {
		
		if (stockPrices == null || stockPrices.length < 2) {
			throw new IllegalArgumentException("Not enough stock prices");
		}
		
		long diff = 0, maxDiff = 0, max = 0;
		long min = stockPrices[0];
		
		for (int i = 1; i < stockPrices.length; i++) {
			
			diff += stockPrices[i] - stockPrices[i-1];
			
			// Max value
			if (diff > maxDiff) {
				maxDiff = diff;
				max = stockPrices[i];
			}
			
			// Min value
			if (stockPrices[i] < min) {
				min = stockPrices[i];
				diff = 0;
			}				
		}
		
		// buy at = max - maxDiff
		//System.out.println("buy: "+ (max-maxDiff));
		// sell at = max
		//System.out.println("sell: "+max);

		return (max - (max - maxDiff));
	}
	
}

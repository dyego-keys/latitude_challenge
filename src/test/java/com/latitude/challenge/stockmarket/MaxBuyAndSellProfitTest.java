package com.latitude.challenge.stockmarket;
 
/**
 * @author Diego
 * 
 */
 
import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class MaxBuyAndSellProfitTest {
 
	@Test
	public void testArrayWithMinBeforeMaxValue() {
		
		int stockPrices[] = {10, 7, 5, 8, 11, 9};	
		assertEquals("Array with min before max value: ", 6, MaxBuyAndSellProfit.getMaxProfit(stockPrices));
	}
 
	@Test
	public void testArrayWithoutUsingMaxValue() {
		
		int stockPrices[] = {11, 22, 15, 8, 20, 3};	
		assertEquals("Array without using max value: ", 12, MaxBuyAndSellProfit.getMaxProfit(stockPrices));
	}
	
	@Test
	public void testArrayWithoutUsingMinValue() {
		int stockPrices[] = {10, 30, 5, 8, 20, 3};
		assertEquals("Array without using min value: ", 20, MaxBuyAndSellProfit.getMaxProfit(stockPrices));
	}
	
	@Test
	public void testArraySameValue() {
		int stockPrices[] = {5, 5, 5, 5, 5, 5};
		assertEquals("Array same value: ", 0, MaxBuyAndSellProfit.getMaxProfit(stockPrices));
	}
	
	@Test
	public void testArrayDecendingValues() {
		int stockPrices[] = {10, 8, 7, 3};
		assertEquals("Array decending values: ", 0, MaxBuyAndSellProfit.getMaxProfit(stockPrices));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testArrayOneValue() {
		int stockPrices[] = {5};
		assertEquals("Array one value: ", 5, MaxBuyAndSellProfit.getMaxProfit(stockPrices));
	}
}
package com.latitude.challenge.stockmarket;
 
/**
 * @author Diego
 * 
 */
 
import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class MaxProfitTest {
 
	@Test
	public void testArrayWithMinBeforeMaxValue() {
		
		int stockPrices[] = {10, 7, 5, 8, 11, 9};	
		assertEquals("Array with min before max value: ", 6, MaxProfit.getMaxProfit(stockPrices));
	}
	
	@Test
	public void testArrayWithoutUsingMinValue() {
		int stockPrices[] = {10, 30, 11, 12, 13, 14};
		assertEquals("Array without using min value: ", 20, MaxProfit.getMaxProfit(stockPrices));
	}
	
	@Test
	public void testArraySameValue() {
		int stockPrices[] = {5, 5, 5, 5, 5, 5};
		assertEquals("Array same value: ", 0, MaxProfit.getMaxProfit(stockPrices));
	}
	
	@Test
	public void testArrayDecendingValues() {
		int stockPrices[] = {10, 8, 7, 3, 2 , 1};
		assertEquals("Array decending values: ", 0, MaxProfit.getMaxProfit(stockPrices));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testArrayOneValue() {
		int stockPrices[] = {5};
		assertEquals("Array one value: ", 5, MaxProfit.getMaxProfit(stockPrices));
	}
	
	@Test
	public void testArrayLongWithMinBeforeMaxValue() {
		
		int[] stockPrices = {37, 69, 67, 35, 33, 52, 92, 57, 67, 61, 64, 62, 22, 43, 13, 44, 68, 50, 87, 20, 45, 30, 89, 21, 37, 12, 97, 90, 20, 6, 41, 74, 56, 22, 13, 39, 62, 73, 18, 72, 10, 39, 94, 91, 41, 71, 18, 75, 48, 13, 12, 12, 80, 67, 55, 93, 80, 64, 56, 92, 71, 54, 21, 33, 47, 24, 69, 97, 79, 27, 70, 77, 30, 58, 91, 94, 60, 8, 13, 88, 23, 98, 34, 12, 63, 67, 93, 45, 82, 99, 61, 34, 36, 5, 40, 62, 90, 21, 68, 20};
		assertEquals("Long array with min before max value: ", 93, MaxProfit.getMaxProfit(stockPrices));
	}
}
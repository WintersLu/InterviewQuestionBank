package LeetCode;

public class BestTimeToBuyAndSellStockIII {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStockIII b = new BestTimeToBuyAndSellStockIII();
		int[] prices = {1, 2, 5, 4, 6, 7, 3, 2, 5};
		b.maxProfit(prices);

	}

	public int maxProfit(int[] prices) {
		
		
		int min = prices[0];
		int[] array1 = new int[prices.length];
		for(int i=1; i<prices.length; i++){
			array1[i] = prices[i] - min;
			array1[i] = Math.max(array1[i], array1[i-1]);
			min = Math.min(min, prices[i]);
		}
		
		int max= prices[prices.length-1];
		int[] array2 = new int[prices.length];
		for(int i=prices.length-2; i>=0; i--){
			array2[i] = max - prices[i];
			array2[i] = Math.max(array2[i], array2[i+1]);
			max = Math.max(max, prices[i]);
		}
		int result = 0;
		for(int i=0; i<prices.length; i++){
			result = Math.max(result, array1[i] + array2[i]);
		}
		return result;
	}

}

package LeetCode;

public class BestTimeToBuyAndSellStockII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length == 0) return profit;
        
        int previous = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i] > previous){
                profit += prices[i]-previous;
            }
            previous = prices[i];
        }
        return profit;
    }
	
}

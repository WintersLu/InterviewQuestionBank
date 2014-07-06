package LeetCode;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProfit(int[] prices) {
        int d = 0;
        int max = 0;
        
        for(int i=1; i<prices.length; i++){
            d = prices[i] - prices[i-1] + Math.max(0, d);
            if(d > max) max = d;
        }
        
        return max;
    }

}

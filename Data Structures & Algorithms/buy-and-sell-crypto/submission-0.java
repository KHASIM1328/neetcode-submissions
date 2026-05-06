class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int maxProfit = 0;

        int minPrice = prices[0];

        for(int i=1; i<n; i++){
            int currProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currProfit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
        
    }
}

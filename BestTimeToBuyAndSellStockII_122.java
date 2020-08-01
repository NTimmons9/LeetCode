class Solution {
    public int maxProfit(int[] prices) {
        int sell = prices[prices.length - 1];
        int buy = prices[prices.length - 1];
        int profit = 0;
        for(int i = prices.length - 2; i >=0; --i){
            if(prices[i] > buy){
                profit += sell - buy;
                buy = prices[i];
                sell = prices[i];
            }
            if(prices[i] < buy){
                buy = prices[i];
            }
        }
        profit += sell - buy;
        return profit;
    }
}
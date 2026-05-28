class Solution {
    public int maxProfit(int[] prices) {
        int buy_day = 0;
        int sell_day = 1;
        int maxprofit = 0;
        while(sell_day < prices.length){
            if(prices[buy_day] < prices[sell_day]){
                int profit = prices[sell_day] - prices[buy_day];
                maxprofit = Math.max(profit, maxprofit);
            }
            else{
                buy_day = sell_day;
            }
            sell_day++;
        }
        return maxprofit;
        
    }
}

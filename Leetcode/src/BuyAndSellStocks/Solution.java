package BuyAndSellStocks;

class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length == 0 || prices.length ==1) return 0;

        int m = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
                max = 0;
            }

            if( max < prices[i]){
                max = prices[i];
            }

            m = Math.max(m,max - min);

        }
        return m;
    }
}
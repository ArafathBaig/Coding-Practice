package BuyAndSellStocks3;

import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {

        int dp[][] = new int[2][prices.length];

        for(int a[] : dp)
            Arrays.fill(a,-1);

        return recursion(prices,0,0,dp);

    }

    private int recursion(int[] p, int i, int j, int dp[][]){

        if(i >= p.length)
            return 0;

        if(dp[j][i] != -1)
            return dp[j][i];

        int val = 0;

        if(j == 0){
            val = Math.max(recursion(p,i+1,1,dp) - p[i], recursion(p,i+1,0,dp));
        }else{
            val = Math.max(p[i] + recursion(p,i+2,0,dp), recursion(p,i+1,1,dp));
        }

        dp[j][i] = val;

        return val;
    }
}
package coinChange1d;

import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[] = new int[amount+1];

        Arrays.fill(dp, Integer.MAX_VALUE-1);
        dp[0] = 0;

        for(int i = 0 ;i < coins.length ;i++){
            for(int j = 1 ;j < amount+1 ; j++){

                if(coins[i] <= j){
                    dp[j] = Math.min(dp[j-coins[i]]+1,dp[j]);
                }
            }
        }
        return dp[amount] >= Integer.MAX_VALUE -1 ? -1 : dp[amount];
    }
}

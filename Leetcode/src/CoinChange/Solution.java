package CoinChange;

class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[][] = new int[coins.length+1][amount+1];

        int n = coins.length;

        for(int i = 0; i <= n ;i++){
            for(int j = 1; j <= amount ;j++){

                if(i == 0){
                    dp[i][j] = Integer.MAX_VALUE-1;
                    continue;
                }

                if(coins[i-1] <= j){
                    dp[i][j] = Math.min(1 + dp[i][j-coins[i-1]], dp[i-1][j] );
                }else{
                    dp[i][j] = dp[i-1][j];
                }

                // System.out.println(dp[i][j]);
            }
        }

        return dp[coins.length][amount] >= Integer.MAX_VALUE-1? -1 : dp[coins.length][amount];
    }

//     private int recursion(int[] a, int i, int j,int dp[][]){

//         if(j == 0){
//             dp[i][j] = 0;
//             return 0;
//         }
//         if(i == 0)
//             return Integer.MAX_VALUE;

//         if(dp[i][j] != -1)
//             return dp[i][j];

//         // System.out.println(i+" "+j);
//         if(a[i-1] <= j){
//             dp[i][j] = Math.min(recursion(a, i, j-a[i-1],dp), recursion(a,i-1,j,dp)) + 1;
//         }else{
//             dp[i][j] = recursion(a,i-1,j,dp);
//         }

//         return dp[i][j];

//     }
}
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int dp[] = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < cost.length ;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        
        dp[dp.length-1] = Math.min(dp[cost.length-1],dp[cost.length-2]);
        return cost.length == 2 ? Math.min(cost[0],cost[1]) : dp[cost.length];
    }
    
//     private void dfs(int []dp, int c[], int ind, int sum){
        
//         if(ind>=cost.length){
//             dp[i] = Math.min(dp[i],cost);
//             return;
//         }
        
//         dp[ind] = Math.min(dp[ind])
        
//     }
}
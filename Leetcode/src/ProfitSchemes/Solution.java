package ProfitSchemes;

import java.util.Arrays;

class Solution {
    int mod = 1000000007;
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        // System.out.println("-------------");
        int dp[][][] = new int[n+1][minProfit+1][group.length+1];

        for(int a[][] : dp ){
            for(int b[] : a){
                Arrays.fill(b,-1);
            }
        }
        return recursion(n,minProfit, group, profit, profit.length,dp)%mod;
    }

    private int recursion(int n, int mp, int g[], int p[], int ind,int dp[][][]){


        // System.out.println(ind+" "+n+" "+mp);
        int val = 0;
        if(mp <= 0)
            val += 1;

        if(ind == 0 || n <= 0)
            return val;

        mp = mp< 0 ? 0 : mp;
        if(dp[n][mp][ind] != -1)
            return dp[n][mp][ind];

        if(g[ind-1] <= n){
            return dp[n][mp][ind] = recursion(n-g[ind-1], mp - p[ind-1], g,p,ind-1,dp)%mod + recursion(n,mp,g,p,ind-1,dp)%mod;
        }

        return dp[n][mp][ind] = recursion(n,mp,g,p,ind-1,dp)%mod;
    }
}
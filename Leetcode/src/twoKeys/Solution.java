package twoKeys;

import java.util.Arrays;

class Solution {
    public int minSteps(int n) {
        if(n == 1)
            return 0;

        int dp[][] = new int[n+1][n+1];

        for(int a[] : dp)
            Arrays.fill(a,-1);

        return 1 + recursion(dp,n,1,1);
    }

    private int recursion(int dp[][], int n, int i,int prev){
        if(i > n)
            return 1000;

        if(i == n)
            return 0;

        if(dp[i][prev] != -1)
            return dp[i][prev];


        dp[i][prev] = Math.min(recursion(dp,n,i+prev,prev), recursion(dp,n,i+i,i) + 1) + 1;

        return dp[i][prev];
    }
}

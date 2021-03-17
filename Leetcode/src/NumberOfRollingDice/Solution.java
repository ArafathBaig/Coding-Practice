package NumberOfRollingDice;

import java.util.Arrays;

class Solution {


    int mod = 1000000007;
    public int numRollsToTarget(int d, int f, int t) {

        int dp[][] = new int[d+1][t+1];

        for(int a[] : dp)
            Arrays.fill(a,-1);


        return traverse(d,f,t,dp);


    }

    private int traverse(int d, int f, int t,int dp[][]){

        // System.out.println(d+ " " + t);
        if(d == 0){

            if(t == 0)
                return 1;

            return 0;
        }

        if(t< 0)
            return 0;

        if(dp[d][t] !=  -1) return dp[d][t];

        int sum = 0;

        for(int i = f ;i >= 1; i--){
            sum = (sum%mod + traverse(d-1,f,t-i,dp)%mod)%mod;
        }

        dp[d][t] = sum;

        return sum;

    }
}

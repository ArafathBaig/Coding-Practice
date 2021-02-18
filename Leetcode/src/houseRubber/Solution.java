package houseRubber;

import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {

        int dp[] = new int[nums.length];

        Arrays.fill(dp,-1);

        return recursion(nums,0,dp);

    }

    private int recursion(int n[], int i, int dp[]){

        if(i >= n.length){
            return 0;
        }

        if(dp[i] != -1)
            return dp[i];

        dp[i] = Math.max(n[i] + recursion(n,i+2, dp), recursion(n,i+1,dp));

        return dp[i];
    }
}

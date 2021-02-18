package HouseRobber2;

import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1)
            return nums[0];

        int dp1[] = new int[nums.length];
        int dp2[] = new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        return Math.max(recursion(nums,0,nums.length-1,dp1),recursion(nums,1,nums.length,dp2));

    }

    private int recursion(int n[], int i, int j, int dp[]){

        if(i >= j){
            return 0;
        }

        if(dp[i] != -1)
            return dp[i];

        dp[i] = Math.max(n[i] + recursion(n,i+2,j, dp), recursion(n,i+1,j,dp));

        return dp[i];
    }
}

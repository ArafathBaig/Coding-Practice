package LongestIncreasingSubsequence;

import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {

        int dp[] = new int[nums.length];

        Arrays.fill(dp,1);
        int max = 1;
        int n = nums.length;
        for(int i = 0; i < n;i++){
            for(int j = i+1; j < n; j++){

                if(nums[j] > nums[i]){
                    dp[j] = Math.max(dp[j], 1+dp[i]);
                }

                max= Math.max(dp[j], max);
            }

        }

        return max;
    }
}

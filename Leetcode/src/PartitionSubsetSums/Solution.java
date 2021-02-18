package PartitionSubsetSums;

class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;

        for(int n : nums)
            sum+= n;

        if(sum%2==1)
            return false;

        sum /=2;
        boolean dp[][] = new boolean[nums.length+1][sum+1];

        for(int i = 0; i < nums.length+1; i++){
            for(int j = 0 ; j < sum+1; j++){

                if(j == 0){
                    dp[i][j] = true;
                    continue;
                }

                if(i == 0){
                    dp[i][j] = false;
                    continue;
                }

                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[nums.length][sum];
    }
}

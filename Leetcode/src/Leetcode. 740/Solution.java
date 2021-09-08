class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int dp[] = new int[nums.length];
        
        Arrays.fill(dp,-1);
        Arrays.sort(nums);
        return recursion(nums,dp,0);
    }
    
    private int recursion(int nums[], int dp[], int ind){
        // System.out.println(ind);
        if(ind >= nums.length)
            return 0;
        
        if(dp[ind] != -1)
            return dp[ind];
        
        int n = nums.length;
        int nextIndex = ind, sum = nums[nextIndex], ele = nums[nextIndex];
        
        while(nextIndex+1 < n && nums[nextIndex] == nums[nextIndex+1] ){
            sum+= nums[nextIndex++];
        }
        
        while(nextIndex+1 < n && nums[nextIndex+1] == ele + 1){
            nextIndex++;
        }
        
        
        return dp[ind] = Math.max(sum + recursion(nums,dp,nextIndex+1), recursion(nums,dp,ind+1));
    }
}
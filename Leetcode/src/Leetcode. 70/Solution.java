class Solution {
    public int climbStairs(int n) {
        
        int dp[] = new int[n+1];
        
        Arrays.fill(dp,-1);
        
        return recursion(dp,0,n);
    }
    
    private int recursion(int dp[], int curr, int limit){
        
        if(curr == limit)
            return 1;
        
        if(curr > limit)
            return 0;
        
        if(dp[curr] != -1)
            return dp[curr];
        
        
        
        return dp[curr] = recursion(dp,curr+1, limit) + recursion(dp,curr+2, limit);
    }
}
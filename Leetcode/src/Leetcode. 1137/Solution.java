class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        
        Arrays.fill(dp,-1);
        return fibonacci(dp,n);
    }
    private int fibonacci(int[] dp, int n){
        
        if(n <= 0)
            return 0;
        
        if(n == 1)
            return 1;
        
        if(n == 2)
            return 1;
        
        if(dp[n] != -1)
            return dp[n];
        
        return dp[n] = fibonacci(dp,n-1) + fibonacci(dp,n-2) + fibonacci(dp,n-3);
    }
}
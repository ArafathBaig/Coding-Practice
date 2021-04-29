class Solution {
    public int integerBreak(int n) {
        if (n == 2)
            return 1;

        if (n == 3)
            return 2;

        int dp[] = new int[n + 1];

        Arrays.fill(dp, -1);

        return recursion(dp, n, n);
    }

    private int recursion(int dp[], int i, int n) {

        if (i <= 1) {
            return 1;
        }

        if (dp[i] != -1)
            return dp[i];

        int ans = 1;

        for (int k = 1; k <= i; k++) {
            ans = Math.max(ans, k * (recursion(dp, i - k, n)));
        }
        dp[i] = ans;
        return ans;

    }
}
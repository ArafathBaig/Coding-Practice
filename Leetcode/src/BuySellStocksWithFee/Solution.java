class Solution {
    public int maxProfit(int[] prices, int fee) {

        int dp[][] = new int[2][prices.length];

        for (int a[] : dp)
            Arrays.fill(a, -1);

        int res = recursion(0, 0, fee, dp, prices);

        return res < 0 ? 0 : res;
    }

    private int recursion(int i, int j, int fee, int dp[][], int prices[]) {

        if (i == prices.length)
            return 0;

        if (dp[j][i] != -1)
            return dp[j][i];

        if (j == 0) {
            dp[j][i] = Math.max(recursion(i + 1, 1, fee, dp, prices) - prices[i], recursion(i + 1, j, fee, dp, prices));
        } else {
            dp[j][i] = Math.max(prices[i] + recursion(i + 1, 0, fee, dp, prices) - fee,
                    recursion(i + 1, j, fee, dp, prices));
        }

        return dp[j][i];
    }
}

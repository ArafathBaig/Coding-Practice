class Solution {
    public int stoneGameVII(int[] stones) {

        int n = stones.length;

        int dp[][] = new int[n][n];

        for (int a[] : dp)
            Arrays.fill(a, -1);

        int sum = 0;

        for (int k : stones)
            sum += k;

        return sum - helper(stones, 0, n - 1, dp);
    }

    private int helper(int stones[], int i, int j, int dp[][]) {

        if (i == j)
            return stones[i];

        if (dp[i][j] != -1)
            return dp[i][j];

        if (j - i == 1) {
            return dp[i][j] = Math.max(stones[i], stones[j]);
        } else {

            int val1 = stones[i] + Math.min(helper(stones, i + 2, j, dp), helper(stones, i + 1, j - 1, dp));
            int val2 = stones[j] + Math.min(helper(stones, i, j - 2, dp), helper(stones, i + 1, j - 1, dp));

            return dp[i][j] = Math.max(val1, val2);
        }
    }
}
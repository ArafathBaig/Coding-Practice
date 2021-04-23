class Solution {
    public int wiggleMaxLength(int[] nums) {

        int dp[][] = new int[2][nums.length];
        fill(dp);
        int temp1 = recursion(dp, 0, 0, nums, -1);
        fill(dp);
        int temp2 = recursion(dp, 0, 1, nums, 1001);

        return Math.max(temp1, temp2);

    }

    private void fill(int[][] dp) {

        for (int a[] : dp)
            Arrays.fill(a, -1);
    }

    private int recursion(int dp[][], int i, int j, int[] n, int prev) {

        if (i >= n.length)
            return 0;

        if (dp[j][i] != -1)
            return dp[j][i];

        int val = 0;
        if (prev < n[i] && j == 0) {
            val = Math.max(recursion(dp, i + 1, 1, n, n[i]) + 1, recursion(dp, i + 1, j, n, prev));
        } else if (prev > n[i] && j == 1) {
            val = Math.max(recursion(dp, i + 1, 0, n, n[i]) + 1, recursion(dp, i + 1, j, n, prev));
        }

        return dp[j][i] = val;
    }
}
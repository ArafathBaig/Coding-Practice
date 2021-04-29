class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int dp[][] = new int[s1.length() + 1][s2.length() + 1];

        for (int a[] : dp)
            Arrays.fill(a, -1);
        return recursion(s1, s2, s3, 0, 0, 0, dp);
    }

    private boolean recursion(String s, String t, String k, int i, int j, int l, int dp[][]) {

        if (l == k.length() && i == s.length() && j == t.length())
            return true;

        if (l == k.length() && (i != s.length() || j != t.length()))
            return false;

        if (dp[i][j] != -1)
            return dp[i][j] == 1 ? true : false;

        char f = k.charAt(l);

        boolean ret = false;

        if (i < s.length() && s.charAt(i) == f)
            ret = ret || recursion(s, t, k, i + 1, j, l + 1, dp);

        if (j < t.length() && t.charAt(j) == f)
            ret = ret || recursion(s, t, k, i, j + 1, l + 1, dp);

        dp[i][j] = ret == true ? 1 : 0;
        return ret;
    }
}

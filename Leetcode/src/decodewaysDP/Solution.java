class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        int dp[] = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {

            if (s.charAt(i) != '0') {
                dp[i] += dp[i + 1];

                if (i + 1 < s.length()) {
                    String temp = s.substring(i, i + 2);

                    if (temp.compareTo("27") < 0)
                        dp[i] += dp[i + 2];
                }
            }
        }

        return dp[0];
    }

}
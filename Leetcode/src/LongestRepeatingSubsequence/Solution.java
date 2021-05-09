// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    public int LongestRepeatingSubsequence(String str) {
        // code here
        int dp[][] = new int[str.length()][str.length()];

        for (int a[] : dp)
            Arrays.fill(a, -1);

        return recursion(str, str, 0, 0, dp);
    }

    private int recursion(String s, String t, int i, int j, int dp[][]) {

        if (i == s.length() || j == t.length())
            return 0;

        if (dp[i][j] != -1 && i != j)
            return dp[i][j];

        if (s.charAt(i) == t.charAt(j) && i != j)
            return dp[i][j] = 1 + recursion(s, t, i + 1, j + 1, dp);

        return dp[i][j] = Math.max(recursion(s, t, i, j + 1, dp), recursion(s, t, i + 1, j, dp));

    }
}
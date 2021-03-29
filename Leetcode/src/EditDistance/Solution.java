package EditDistance;

import java.util.Arrays;

class Solution {
    public int minDistance(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int[n+1][m+1];

        for(int a[] : dp)
            Arrays.fill(a,-1);

        return recursion(word1, word2,0,0,dp);
    }

    private int recursion(String s, String t, int i, int j, int dp[][]){

        if(i >= s.length() || j >= t.length()){
            return j >= t.length() ? s.length()-i : t.length() - j;
        }

        if(dp[i][j] != -1)
            return dp[i][j];


        if(s.charAt(i) == t.charAt(j))
            return dp[i][j] = recursion(s,t,i+1,j+1,dp);


        return dp[i][j] = 1 + Math.min(recursion(s,t,i+1,j+1,dp) , Math.min(recursion(s,t, i+1, j, dp), recursion(s,t,i,j+1, dp)));
    }
}

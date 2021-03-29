package LPS;

class Solution {
    public int longestPalindromeSubseq(String s) {

        StringBuilder t = new StringBuilder();

        for(int i = s.length() -1 ; i >= 0 ; i--){
            t.append(s.charAt(i));
        }

        String n = t.toString();

        int k = s.length();

        int dp[][] = new int[k+1][k+1];



        return lcs(s,n,s.length(), s.length(),dp);
    }

    private int lcs(String s, String t, int i , int j, int dp[][]){

        if(i == 0 || j == 0)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];


        if(s.charAt(i-1) == t.charAt(j-1)){
            return dp[i][j] = 1 + lcs(s,t,i-1,j-1,dp);
        }

        return dp[i][j] = Math.max(lcs(s,t,i-1,j,dp),lcs(s,t,i,j-1,dp));
    }
}
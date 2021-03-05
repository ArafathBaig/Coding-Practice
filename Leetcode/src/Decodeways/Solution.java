package Decodeways;

import java.util.Arrays;

class Solution {
    public int numDecodings(String s) {

        if(s.charAt(0) == '0')
            return 0;

        for(int i= 1 ; i < s.length() ;i++){
            char c = s.charAt(i);

            if(s.charAt(i-1) >= '3' && c == '0')
                return 0;
        }

        int dp[] = new int[s.length()];


        Arrays.fill(dp,-1);
        return recursion(s,0,dp);

    }

    private int recursion(String s, int i, int dp[]){

        if(i == s.length())
            return 1;

        if(dp[i] != -1)
            return dp[i];

        if(s.charAt(i) == '0')
            return 0;

        int val = 0;

        val += recursion(s,i+1,dp);

        if(i+1 < s.length()){
            String temp = s.substring(i,i+2);

            if(temp.compareTo("27") < 0)
                val += recursion(s,i+2, dp);
        }

        dp[i] = val;

        return val;
    }
}

package Traingle;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> t) {

        int dp[][] = new int[t.size()][t.size()];

        for(int a[] : dp)
            Arrays.fill(a,-1);

        return recursion(t,dp,0,0);
    }

    private int recursion(List<List<Integer>> list, int dp[][], int r, int c){

        if(r == list.size())
            return 0;

        if(dp[r][c] != -1)
            return dp[r][c];

        List<Integer> l = list.get(r);

        return dp[r][c] = Math.min(recursion(list,dp,r+1,c),recursion(list,dp,r+1,c+1)) + l.get(c);

    }
}
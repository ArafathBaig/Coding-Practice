package reducingDishes;

import java.util.Arrays;

class SolutionDP {
    public int maxSatisfaction(int[] s) {

        Arrays.sort(s);

        int dp[][] = new int[s.length+1][s.length+2];

        for(int a[] : dp)
            Arrays.fill(a, -1);

        return fun(s,dp,0,1);
    }

    private int fun(int[] s, int dp[][], int i, int j){

        if(i == s.length)
            return dp[i][j] = 0;

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        return dp[i][j] = Math.max(s[i]*j + fun(s,dp,i+1,j+1), fun(s,dp,i+1,j));
    }
}
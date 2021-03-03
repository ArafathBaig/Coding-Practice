package minimumFallingPath2;

import java.util.Arrays;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int dp[][] = new int[n][n];

        for(int a[] : dp)
            Arrays.fill(a,-1);


        int min = 500000;
        for(int i = 0; i < n ;i++)
            min = Math.min(min,recursion(matrix, n,0,i,dp));

        return min;

    }

    private int recursion(int m[][], int n, int r, int c, int dp[][]){

        if(r >= n)
            return 0;

        if(c < 0|| c >= n)
            return 100000;

        if(dp[r][c] != -1)
            return dp[r][c];

        int min = 100000;
        for(int i = 0 ; i < n ;i++){

            if(i == c)
                continue;

            min = Math.min(min,recursion(m,n,r+1,i,dp)+ m[r][c]) ;


        }
        //System.out.println(r + " " + c +   " " + min);
        return dp[r][c] = min;
    }
}
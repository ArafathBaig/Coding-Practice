package OnesAndZeroes;

import java.util.Arrays;

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {

        int zeroes[] = new int[strs.length];
        int ones[] = new int[strs.length];

        int j = strs.length -1;
        for(String s : strs){

            int z =0, o = 0;
            for(int i = 0; i < s.length() ;i++){

                char c = s.charAt(i);

                if(c == '1')
                    o++;
                else
                    z++;
            }

            zeroes[j] = z;
            ones[j--] = o;
        }


        int dp[][][] = new int[m+1][n+1][strs.length+1];

        for(int a[][] : dp){
            for(int b[] : a){
                Arrays.fill(b,-1);
            }
        }

        return recursion(zeroes,ones,m,n,strs.length-1,dp);


    }

    private int recursion(int z[], int o[], int m, int n, int i,int dp[][][]){

        if(i<0)
            return 0;

        if(m <= 0 && n<= 0)
            return 0;

        if(dp[m][n][i] != -1)
            return dp[m][n][i];

        int val = 0;

        if(z[i]>m || o[i] >n)
            return dp[m][n][i] = recursion(z,o,m,n,i-1,dp);

        dp[m][n][i] = Math.max(1 + recursion(z,o,m-z[i],n-o[i],i-1,dp), recursion(z,o,m,n,i-1,dp));

        return dp[m][n][i];
    }
}

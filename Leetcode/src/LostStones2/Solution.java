package LostStones2;

import java.util.Arrays;

class Solution {

    int min = Integer.MAX_VALUE;
    int su = 0;
    public int lastStoneWeightII(int[] stones) {

        min = Integer.MAX_VALUE;
        su = 0;

        for(int n : stones)
            su+=n;

        int n = stones.length;
        int dp[][] = new int[n][su*2+1];

        for(int a[] : dp)
            Arrays.fill(a,-1);

        recursion(dp,stones,0,0,0);
        return min;
    }

    private void recursion(int dp[][], int s[], int i,int j,int sum){


        if(i >= s.length){
            min = Math.min(min,sum);
            return;
        }

        int k = su+sum;
        if(dp[i][k] != -1 && sum >= dp[i][k]){
            return;
        }

        dp[i][k] = sum;


        recursion(dp,s,i+1,j,Math.abs(s[i] + sum));
        recursion(dp,s,i+1,j,Math.abs(s[i] - sum));
    }
}
package com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int chef = 6;
        int newbies = 7;

        int dp[][] = new int[chef+1][newbies+1];

        for(int a[] : dp)
            Arrays.fill(a,-1);

        int ans = recursion(dp,chef,newbies);
        System.out.println(Math.max(0,ans));
    }

    private static int recursion(int dp[][], int n , int c){

        if(n < 0 || c < 0)
            return -2;

        if(n == 0 && c == 0){
            return 0;
        }

        if(dp[n][c] != -1)
            return dp[n][c];

        int one = recursion(dp, n-1,c-2) +1;
        int two = recursion(dp,n-2,c-1) + 1;

        one = one < 0 ? -2 : one;
        two = two < 0 ? -2 : two;

        dp[n][c] = Math.max(one, two);

        return dp[n][c];
    }
}

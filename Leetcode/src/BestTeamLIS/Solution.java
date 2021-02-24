package BestTeamLIS;

import java.util.Arrays;

class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int dp[] = new int[scores.length];

        int ar[][] = new int[scores.length][2];

        for(int i = 0 ; i < scores.length ;i++){
            ar[i][0] = ages[i];
            ar[i][1] = scores[i];
        }

        Arrays.sort(ar,(a, b) -> a[1]-b[1]);
        Arrays.sort(ar,(a,b) -> a[0]-b[0]);

        // for(int a[] : ar)
        //     System.out.println(Arrays.toString(a));

        int max = 0;
        int n = scores.length;
        for(int i = 0; i< n ;i++){
            int curScore = 0;
            dp[i] += ar[i][1];
            for(int j = i+1; j < n ;j++){

                if(ar[i][1] <= ar[j][1] || ar[i][0] == ar[j][0]){

                    dp[j] = Math.max(dp[j],dp[i]);
                    // System.out.println(j+" " +dp[j]);
                }
            }

            max = Math.max(dp[i], max);
        }

        // System.out.println("-----------");

        return max;
    }


}
package MaximumProfit;

import java.util.Arrays;

class SolutionTLE {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = profit.length;
        int dp[] = new int[n];

        dp[0] = profit[0];
        int sa[][] = new int[n][3];
        for(int i = 0 ; i < profit.length ;i++){

            sa[i][0] = startTime[i];
            sa[i][1] = endTime[i];
            sa[i][2] = profit[i];
        }

        Arrays.sort(sa, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        int max = 0;

        for(int i = n-1 ; i>= 0; i--){

            int et = sa[i][1];
            int val =sa[i][2];
            for(int j =  n-1 ; j > i ;j--){

                int st = sa[j][0];
                if(st<et)
                    break;

                // System.out.println(i+" "+j);
                val = Math.max(sa[i][2]+sa[j][2] , val);


            }
            sa[i][2] = val;
            max = Math.max(max, val);
        }


        return max;
    }
}
package MaximumProfit;

import java.util.Arrays;
import java.util.TreeMap;

class Solution {
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

        Arrays.sort(sa, (i1, i2) -> Integer.compare(i1[1], i2[1]));

        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.put(0,0);
        int max = 0;
        for(int a[] : sa){
            int cur = map.floorEntry(a[0]).getValue() + a[2];

            if(cur > map.lastEntry().getValue())
                map.put(a[1], cur);
        }


        return map.lastEntry().getValue();
    }
}

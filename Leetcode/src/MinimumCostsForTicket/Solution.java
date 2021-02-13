package MinimumCostsForTicket;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int mincostTickets(int[] days, int[] cost) {

        int dp[] = new int[366];

        Set<Integer> set = new HashSet<>();

        for(int n : days)
            set.add(n);

        for(int i = 1; i < 366 ;i++){

            dp[i] = dp[i-1];

            if(set.contains(i)){

                dp[i] = Math.min(dp[i-1] + cost[0],
                        Math.min(dp[Math.max(0,i-7)]+ cost[1], dp[Math.max(0,i-30)]+ cost[2]));
            }
        }

        return dp[365];

    }
}
package DungeonGame;

class Solution {
    public int calculateMinimumHP(int[][] dun) {


        int m = dun.length, n = dun[0].length;

        int dp[] = new int[n+1];
        dp[n] = 1;

        for(int i = m-1 ; i>=0 ; i--){
            for(int j = n-1 ; j>=0 ;j--){

                int health = 0;
                if(i == m-1)  health = dp[j+1] - dun[i][j];
                else if(j == n-1) health = dp[j] - dun[i][j];
                else health = Math.min(dp[j], dp[j+1]) - dun[i][j];

                dp[j] = health > 0 ? health : 1;
            }
        }

        return dp[0];

    }
}

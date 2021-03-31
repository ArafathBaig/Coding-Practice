package RussianDoll;
class Solution {
    public int maxEnvelopes(int[][] e) {

        Arrays.sort(e,(a,b) -> a[0]-b[0]);
        Arrays.sort(e,(a,b) -> a[1] - b[1]);

        int dp[] = new int[e.length];

        Arrays.fill(dp,1);

        int max = 1;
        for(int i = 1 ;i < e.length ;i++){
            for(int j = 0; j < i ;j++){

                if(e[i][0] > e[j][0] && e[i][1] > e[j][1])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }

            max = Math.max(dp[i],max);
        }

        return max;

    }
}
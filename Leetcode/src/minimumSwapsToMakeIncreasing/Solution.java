package minimumSwapsToMakeIncreasing;

class Solution {
    public int minSwap(int[] A, int[] B) {


        int dp[][] = new int[2][A.length];

        dp[1][0] = 1;

        for(int i = 1 ;i < A.length ;i++){
            boolean isInc = A[i-1] < A[i] && B[i-1] < B[i];
            boolean inter= A[i-1] < B[i] && B[i-1] < A[i];

            if(isInc && inter){
                dp[0][i] = Math.min(dp[0][i-1], dp[1][i-1]);
                dp[1][i] = Math.min(dp[0][i-1], dp[1][i-1])+1;
            }else if(isInc){
                dp[0][i] = dp[0][i-1];
                dp[1][i] = dp[1][i-1] + 1;
            }else{
                dp[0][i] = dp[1][i-1];
                dp[1][i] = dp[0][i-1] + 1;
            }
        }

        return Math.min(dp[0][A.length-1],dp[1][A.length-1]);
    }
}
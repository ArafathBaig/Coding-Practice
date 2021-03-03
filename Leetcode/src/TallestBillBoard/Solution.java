package TallestBillBoard;

class Solution {
    int sum = 0;
    public int tallestBillboard(int[] rods) {

        sum = 0;

        for(int n: rods){
            sum+= n;
        }

        int dp[][] = new int[rods.length+1][sum*2+1];

        recursion(rods,dp,0, 0);

        return dp[0][sum];
    }

    private boolean recursion(int[] r, int dp[][], int i, int j){

        if(i == r.length)
            return j == 0;

        if(dp[i][j+sum] != 0)
            return !(dp[i][j+sum] == -1);

        boolean a = recursion(r,dp,i+1,j + r[i]);
        boolean b = recursion(r,dp,i+1, j - r[i]);
        boolean c = recursion(r,dp,i+1,j);

        boolean res = a|b|c;

        if(a){
            dp[i][j+sum] = Math.max(dp[i][j+sum], dp[i+1][j+r[i]+sum] + r[i] );
        }

        if(b){
            dp[i][j+sum] = Math.max(dp[i][j+sum], dp[i+1][j-r[i]+sum]);
        }

        if(c){
            dp[i][j+sum] = Math.max(dp[i][j+sum], dp[i+1][j+sum] );
        }

        if(!res)
            dp[i][j+sum] = -1;

        return res;
    }
}
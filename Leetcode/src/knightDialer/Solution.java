package knightDialer;

class Solution {

    int steps[][] = {{-2,-1},{-2,1},{1,-2},{-1,-2},{2,-1},{2,1},{1,2},{-1,2}};
    long dp[][] = new long[12][5001];
    int mod = 1000000007;
    public int knightDialer(int n) {

        int key[][] = new int[4][3];

        long ans = 0;
        for(int i = 0; i < 4 ;i++ ){
            for(int j = 0; j < 3 ;j++){
                ans = (ans%mod + recursion(key,i,j,4,3,n-1)%mod)%mod;
            }
        }

        return((int) ans%mod);

    }

    private long recursion(int key[][], int r, int c, int m , int n, int k){

        if(r >= m || c >= n || r< 0 || c < 0 || (r == 3 && c == 0) || (r==3 && c ==2))
            return 0;

        if(k == 0)
            return 1;

        int val = (r*n)+(c%n) +1;

        // System.out.print(val+ " ");
        if(dp[val][k] != 0)
            return dp[val][k];

        long count = 0;
        for(int a[] : steps){
            count = (count%mod + recursion(key, r + a[0], c+a[1], m, n, k-1)%mod ) %mod;
            // System.out.println();
        }

        return dp[val][k] = count;
    }
}
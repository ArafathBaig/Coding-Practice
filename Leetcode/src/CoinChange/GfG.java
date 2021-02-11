package CoinChange;

import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t!=0){
            int n = scan.nextInt();
            int a[] = new int[n];

            for(int i = 0; i < n ;i++){
                a[i] = scan.nextInt();
            }

            int s = scan.nextInt();

            int dp[][] = new int[n+1][s+1];

            for(int i = 0 ; i < n+1 ;i++){
                for(int j = 0 ; j < s+1;j++){
                    if(i == 0){
                        dp[i][j] = 0;
                        continue;
                    }

                    if(j == 0){
                        dp[i][j] = 1;
                        continue;
                    }

                    if(j >= a[i-1]){
                        dp[i][j] = dp[i][j - a[i-1]] + dp[i-1][j];
                    }else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }

            System.out.println(dp[n][s]);
            t--;
        }

    }
}

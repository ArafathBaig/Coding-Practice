package Presum2d;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);

        int m= scan.nextInt();
        int n= scan.nextInt();
        int u= scan.nextInt();
        int v= scan.nextInt();

        int arr[][] = new int[m+1][n+1];

        for(int i = 1 ; i<=m ;i++){
            for(int j = 1; j <= n ;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i = 0 ; i < u ; i++){
            int val = scan.nextInt();
            int r1 = scan.nextInt();
            int c1 = scan.nextInt();
            int r2 = scan.nextInt();
            int c2 = scan.nextInt();

            for(int j= r1+1 ; j <= r2+1 ;j++){
                for(int k = c1+1 ; k <= c2+1 ;k++){
                    arr[k][j] += val;
                }
            }
        }

        int sum = 0;
        for(int i = 1 ; i <= m ;i++){
            sum+= arr[1][i];
            arr[1][i] = sum;
        }

        sum = 0;
        for(int i = 1 ; i <=  n ;i++){
            sum+= arr[i][1];
            arr[i][1] = sum;
        }

        for(int i = 2 ; i <= m ;i++){
            for(int j = 2 ; j <=n ;j++){
                arr[i][j] = arr[i][j] + arr[i-1][j] + arr[i][j-1] - arr[i][j];
            }
        }


        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < v ;i++){
            int r1 = scan.nextInt()+1;
            int c1 = scan.nextInt()+1;
            int r2 = scan.nextInt()+1;
            int c2 = scan.nextInt()+1;

            int ans = arr[r2][c2] - arr[r2][c1-1] - arr[r1-1][c2] + arr[r1-1][c1-1];
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}

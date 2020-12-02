package Presum2d;

/* package codechef; // don't place package name! */

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

        long arr[][] = new long[m+1][n+1];

        for(int i = 1 ; i<=m ;i++){
            for(int j = 1; j <= n ;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        long[][] pre = new long[m+1][n+1];
        for(int i = 0 ; i < u ; i++){
            int val = scan.nextInt();
            int r1 = scan.nextInt()+1;
            int c1 = scan.nextInt()+1;
            int r2 = scan.nextInt()+1;
            int c2 = scan.nextInt()+1;

            for(int j= r1 ; j <= r2 ;j++){

                pre[j][c1] += val;

                if(c2 != m)
                    pre[j][c2+1] -= val;

            }
        }

        //  for(int a[]: arr)
        //     System.out.println(Arrays.toString(a));

        for(int i= 1 ; i <= m ;i++){
            for(int j = 1 ; j <=n ; j++){
                pre[i][j] += pre[i][j-1];
                arr[i][j] += pre[i][j];
            }
        }

        long sum = 0;
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
                arr[i][j] = arr[i][j] + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
            }
        }

        // for(int a[]: arr)
        //     System.out.println(Arrays.toString(a));


        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < v ;i++){
            int r1 = scan.nextInt()+1;
            int c1 = scan.nextInt()+1;
            int r2 = scan.nextInt()+1;
            int c2 = scan.nextInt()+1;

            long ans = arr[r2][c2] - arr[r2][c1-1] - arr[r1-1][c2] + arr[r1-1][c1-1];
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}


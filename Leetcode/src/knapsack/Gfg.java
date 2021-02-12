package knapsack;
// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //reading total testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());

            int val[] = new int[n];
            int wt[] = new int[n];

            String st[] = read.readLine().trim().split("\\s+");

            //inserting the values
            for(int i = 0; i < n; i++)
                val[i] = Integer.parseInt(st[i]);

            String s[] = read.readLine().trim().split("\\s+");

            //inserting the weigths
            for(int i = 0; i < n; i++)
                wt[i] = Integer.parseInt(s[i]);

            //calling method knapSack() of class Knapsack
            System.out.println(new Knapsack().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Knapsack
{
    // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        int dp[][] = new int[n+1][W+1];

        for(int a[]: dp)
            Arrays.fill(a,-1);

        recursion(wt,val,n,W,dp);
        return dp[n][W];
    }

    private static int recursion(int w[], int v[], int n, int we ,int dp[][]){

        if(dp[n][we] != -1)
            return dp[n][we];

        if(n <= 0 || we <= 0)
            return 0;

        int val = 0;

        if(w[n-1] <= we){
            return dp[n][we] = Math.max(recursion(w,v,n-1,we,dp), v[n-1]+ recursion(w,v,n-1,we-w[n-1],dp));
        }

        dp[n][we] = recursion(w,v,n-1,we,dp);

        return dp[n][we];


    }
}




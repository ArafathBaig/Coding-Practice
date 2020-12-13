package MaximumNumberOf1;

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here

        int max = m;
        int res = -1;
        for(int i = 0 ;i < n ;i++){

            int l = 0, r = m-1;

            while(l < r){

                int mid = l + (r-l)/2;

                if(arr[i][mid] < 1)
                    l = mid+1;
                else
                    r = mid;

            }

            if(max > l && arr[i][l] == 1){
                res = i;
                max = l;
            }
        }

        return res;
    }
}
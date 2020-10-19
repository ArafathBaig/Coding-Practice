package MinimizeTheDifference;

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {

        if(n == 1)
            return arr[0];
        // code here

        Arrays.sort(arr);

        int min = arr[0] + k;
        int max = arr[n-1] - k;

        int ans = arr[n-1] - arr[0];
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
        }



        for(int i = 1 ; i < n-1 ;i++){



            int add = arr[i] + k;
            int sub = arr[i] -k ;

            if(add <= max || sub >= min)
                continue;


            if(max - sub < add - min  ){
                min = sub;
            }else{
                max = add;

            }
        }

        return Math.min(ans, max - min);
    }
}


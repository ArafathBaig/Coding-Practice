// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.findPages(a, n, m));
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to find minimum number of pages.
    public static int findPages(int[] a, int n, int m) {
        // Your code here
        // Arrays.sort(a);
        int r = 0;

        for (int k : a)
            r += k;

        int l = 1;

        int ans = -1;
        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (isFeasible(a, m, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private static boolean isFeasible(int a[], int m, int mid) {

        int sum = 0;
        int books = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] > mid)
                return false;

            sum += a[i];
            if (sum > mid) {
                books++;
                sum = a[i];
            }

            if (books > m)
                return false;
        }

        books++;

        return books <= m;
    }

};
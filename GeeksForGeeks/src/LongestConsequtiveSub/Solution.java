// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class Driverclass {
    // Driver Code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            System.out.println(new Solution().findLongestConseqSubseq(a, n));

            t--;
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution {
    // arr[] : the input array
    // N : size of the array arr[]

    // Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int arr[], int N) {
        // add your code here
        Set<Integer> set = new HashSet<>();

        for (int n : arr)
            set.add(n);

        int max = 1;

        for (int n : arr) {

            if (!set.contains(n - 1) && set.contains(n + 1)) {
                int next = n + 1;
                int count = 1;
                while (set.contains(next++)) {
                    count++;
                }
                max = Math.max(count, max);
            }
        }

        return max;
    }
}
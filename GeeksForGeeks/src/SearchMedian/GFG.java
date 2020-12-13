package SearchMedian;

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int R = Integer.parseInt(input_line[0]);
            int C = Integer.parseInt(input_line[1]);
            String line[] = read.readLine().trim().split("\\s+");
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[c++]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int r, int c) {
        // code here
        PriorityQueue<Tuple> minHeap = new PriorityQueue<>((a,b) -> a.val - b.val);
        int count = 0, t = (r*c)/2 + 1;

        // System.out.println(t);
        for(int i = 0 ; i < r ;i++){
            minHeap.add(new Tuple(i,0,matrix[i][0]));
        }

        while(!minHeap.isEmpty()){
            Tuple temp = minHeap.poll();
            count++;

            // System.out.println(count+" "+temp.val);
            if(count == t)
                return temp.val;

            int m = temp.m;
            int n = temp.n + 1;

            if(m >= r || n >= c)
                continue;

            minHeap.add(new Tuple(m,n,matrix[m][n]));
        }

        return -1;

    }

    class Tuple{
        int m,n,val;

        public Tuple(int m, int n, int val){
            this.m = m;
            this.n = n;
            this.val = val;
        }
    }
}
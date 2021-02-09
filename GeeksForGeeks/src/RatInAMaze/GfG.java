// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            GfG g = new GfG();
            ArrayList<String> res = g.findPath(a, n);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class GfG {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        if(m[n-1][n-1] == 0 || m[0][0] == 0)
            return new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();

        dfs(m,n,0,0,list,"");
        Collections.sort(list);
        return list;
    }

    private static void dfs(int m[][], int n, int r, int c, ArrayList<String> list, String s){

        if(r == n-1 && c == n-1){
            list.add(s);
            return;
        }

        if(r >= n || r < 0 || c >= n || c < 0 || m[r][c] == 0 || m[r][c] == 2){
            return;
        }

        m[r][c] = 2;


        dfs(m,n,r-1,c,list,s+ "U");
        dfs(m,n,r+1,c,list,s + "D");
        dfs(m,n,r,c-1,list,s + "L");
        dfs(m,n,r,c+1,list,s + "R");

        m[r][c] = 1;

    }
}
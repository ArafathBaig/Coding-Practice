package MaxRectangle;

// { Driver Code Starts
import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[1000][1000];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
            GfG g = new GfG();

            System.out.println(g.maxArea(a, m, n));
        }
    }
}
// } Driver Code Ends


/*Complete the function given below*/
class GfG {
    public int maxArea(int M[][], int m, int n) {
        // add code here.

        for(int i = 1; i < m ;i++ ){
            for(int j = 0; j < n; j++){

                if(M[i][j] != 0)
                    M[i][j] += M[i-1][j];

            }
        }

        int max = 0;

        for(int a[] : M){
            max = Math.max(max,hist(a));
        }

        return max;
    }

    public int hist(int[] heights) {

        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> stack = new Stack<>();


        for(int i = n-1 ; i >= 0; i--){

            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();

            right[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);

        }

        stack = new Stack<>();

        for(int i = 0 ; i < n; i++){

            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();

            left[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(i);

        }

        int max = 0;


        for(int i = 0; i < n ;i++){
            max = Math.max(max, (right[i] - left[i] -1)*heights[i]);
        }

        return max;
    }
}

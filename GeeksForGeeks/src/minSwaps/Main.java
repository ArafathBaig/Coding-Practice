package minSwaps;// { Driver Code Starts
// Java program to find minimum number of swaps 
// required to sort an array 
import java.util.*;
import java.io.*;

// Driver class 
class Main {
	// Driver program to test the above function 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t--> 0) {
			int n = Integer.parseInt(br.readLine().trim());
			String str[] = br.readLine().trim().split(" ");
			int[] a = new int[n];
			for (int i = 0; i<n; i++) {
				a[i] = Integer.parseInt(str[i]);
			}
			System.out.println(new GfG().minSwaps(a, n));
		}
	}
}// } Driver Code Ends


class GfG {
    // return the minimum number of swaps required to sort the arra
	public int minSwaps(int[] arr, int N) {
	    
	    PriorityQueue<Tuple> minHeap = new PriorityQueue<>((a,b) -> a.val - b.val);
	    
	    for(int i = 0 ; i < N ;i++){
	        minHeap.add(new Tuple(i, arr[i]));
	    }
	    
	    boolean vis[] = new boolean[N];
	    int a[][] = new int[2][N];
	    
	    int i = 0;
	    
	    while(!minHeap.isEmpty()){
	        Tuple t = minHeap.poll();
	        
	        a[0][i] = t.val;
	        a[1][i] = t.i;
	        
	        i++;
	    }
	    
	   // for(int b[] : a)
	   //     System.out.println(Arrays.toString(b));
	    
	        
	    int count = 0;
	    
        for(i = 0 ; i < N ; i++){
            int next = a[1][i];
            
            if(vis[next])
                continue;
            
            int cyc = 0;
            
            while(!vis[next]){
                cyc++;
                vis[next] = true;
                next = a[1][next];
            }
            
            count += cyc-1;
        }
	   return count;
	}
	
	class Tuple{
	    int i, val;
	    
	    public Tuple(int i, int val){
	        this.i = i;
	        this.val = val;
	    }
	}
	
}
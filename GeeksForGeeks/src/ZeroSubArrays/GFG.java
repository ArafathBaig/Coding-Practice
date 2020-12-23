package ZeroSubArrays;

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n;
            n=sc.nextInt();

            int arr[]=new int[n];


            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println(findSubarray(arr,n));
        }

    }

    // } Driver Code Ends


//User function Template for Java

    public static int findSubarray(int[] arr ,int n)
    {
        //Your code here
        Map<Long, Integer> map = new HashMap<>();

        map.put( (long) 0,1);

        long sum = 0;
        int count = 0;
        for(int i = 0; i < n ;i++){
            sum += arr[i];


            if(map.containsKey(sum)){
                count += map.get(sum);
            }


            if(!map.containsKey(sum)){
                map.put(sum,0);
            }

            map.put(sum, map.get(sum)+1);


        }

        return count;
    }




// { Driver Code Starts.


}
// } Driver Code Ends
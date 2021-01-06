package MaximumAllocationOfPages;

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            System.out.println(findPages(a,n,m));
        }
    }


    // } Driver Code Ends


//User function Template for Java

    public static int findPages(int[]a,int n,int m)
    {
        //Your code here

        // Arrays.sort(a);

        if(m > n)
            return -1;

        int left = a[0], right = 0;
        int count = 0;

        for(int i = 0; i < n ;i++){
            right+= a[i];
        }


        while(left< right){

            int mid = left + (right - left)/2;

            count = 0;
            int sum = 0;
            for(int i = 0; i < n ;i++){

                if(a[i] > mid){
                    count = m+1;
                    break;
                }

                sum+= a[i];

                if(sum > mid){
                    sum = a[i];
                    count++;
                }
            }

            count++;


            if(count <= m){
                right = mid;
            }else{
                left = mid+1;
            }


        }

        return right;

    }

// { Driver Code Starts.

}  // } Driver Code Ends
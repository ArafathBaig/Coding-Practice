package PartitionBoard;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t!=0){
            int k = scan.nextInt();
            int n = scan.nextInt();

            if(k >n )
                k = n;

            int a[] = new int[n];
            int sum = 0;
            for(int i = 0; i < n ;i++){
                a[i] = scan.nextInt();
                sum += a[i];
            }

            int l =0, r = sum;

            while(l < r){

                int mid = l + (r-l)/2;

                int count = 1, s=0;
                for(int i = 0; i < n ; i++){

                    s+= a[i];

                    if(a[i] > mid){
                        count = k+1;
                        break;
                    }

                    if(s>mid){
                        count++;
                        s = a[i];
                    }
                }



                if(count <= k){
                    r=mid;
                }else{
                    l=mid+1;
                }
            }
            System.out.println(r+1);
            t--;
        }

    }
}
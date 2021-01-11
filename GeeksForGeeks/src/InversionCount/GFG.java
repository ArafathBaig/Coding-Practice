package InversionCount;

import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class GFG
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t--!=0){
            int n = scan.nextInt();

            int[] a = new int[n];

            for(int i = 0 ; i < n ;i++)
                a[i] = scan.nextInt();

            System.out.println(mergeAndCount(a,0,n-1));
        }

    }

    private static long mergeAndCount(int a[], int l, int r){

        long count= 0;

        if(l<r){

            int m = l + (r-l)/2;

            count+= mergeAndCount(a,l,m);

            count+= mergeAndCount(a,m+1, r);

            // System.out.println(l+" "+m+" "+r);

            count+= merge(a,l,m,r);
        }

        return count;
    }


    private static long merge(int a[], int l, int m , int r){

        int left[] = Arrays.copyOfRange(a,l,m+1);
        int right[] = Arrays.copyOfRange(a,m+1, r+1);

        int i =0, j =0;
        long swaps = 0;
        int k = l;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j])
                a[k++] = left[i++];
            else{
                a[k++] = right[j++];
                swaps += (m+1) - (l+i);
            }

        }

        while(i<left.length)
            a[k++] = left[i++];

        while(j < right.length)
            a[k++] = right[j++];

        return swaps;
    }
}

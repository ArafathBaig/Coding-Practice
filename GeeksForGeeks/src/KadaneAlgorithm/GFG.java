package KadaneAlgorithm;
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
            int n = scan.nextInt();

            int[] a = new int[n];

            for(int i= 0 ; i< n; i++)
                a[i] = scan.nextInt();

            int max = Integer.MIN_VALUE,  m = 0;
            for(int i = 0 ; i < n ; i++){

                m = Math.max(m+a[i], a[i]);

                max = Math.max(m,max);
            }

            System.out.println(max);
            t--;
        }

    }
}
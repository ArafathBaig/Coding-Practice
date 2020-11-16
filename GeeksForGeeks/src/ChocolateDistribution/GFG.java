package ChocolateDistribution;

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

            long a[] = new long[n];

            for(int i = 0 ; i < n;i++){
                a[i] = scan.nextInt();
            }

            Arrays.sort(a);
            // System.out.println(Arrays.toString(a));
            int m = scan.nextInt();
            long min = Long.MAX_VALUE;

            for(int i = 0; i <= n-m ;i++){
                min = Math.min(min, a[i+m-1] - a[i]);
            }

            System.out.println(min);

            t--;
        }

    }
}

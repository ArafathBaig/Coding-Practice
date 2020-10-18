package MinMax;

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

            long min = Long.MAX_VALUE , max = 0;

            for(int i = 0 ;i < n ;i++){
                int cur = scan.nextInt();
                min = Math.min(min,cur);
                max = Math.max(max, cur);
            }

            System.out.println(min+" "+max);

            t--;
        }

    }
}

package MinimumSwapsLessThanK;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t--!=0){
            int n = scan.nextInt();
            int a[] = new int[n];

            for(int i = 0; i < n;i++){
                a[i] = scan.nextInt();
            }

            int k = scan.nextInt();
            int count = 0;

            for(int f : a){

                if(f <= k)
                    count++;
            }

            int wrongPlaced = 0;

            for(int i= 0; i < count ;i++){

                if(a[i] > k)
                    wrongPlaced++;
            }

            System.out.println(wrongPlaced);
        }

    }
}
package Blondie;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t--!=0){

            int n = scan.nextInt();
            int a[] = new int[n];

            long sum = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n ;i++){
                long temp = scan.nextLong();

                if(temp < 0)
                    temp = sum/i;

                sum +=temp;
                sb.append(temp).append(" ");
            }




            System.out.println(sb);
        }
    }
}

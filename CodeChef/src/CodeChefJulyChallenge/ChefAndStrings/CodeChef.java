package CodeChefJulyChallenge.ChefAndStrings;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeChef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0){
            int n = scan.nextInt();
            int a[] = new int[n];

            for(int i = 0;  i < n ;i++){
                a[i] = scan.nextInt();
            }

            long sum = 0;

            for(int i = 0 ; i < n-1 ;i++){
                int k = Math.abs(a[i]-a[i+1])-1;

                if(k > 0)
                    sum+=k;
            }
            System.out.println(sum);
        }
    }
}
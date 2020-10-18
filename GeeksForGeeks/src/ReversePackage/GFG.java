package ReversePackage;

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

            int[] array = new int[n];

            for(int i = 0 ; i < n ;i++){
                array[n-i-1] = scan.nextInt();
            }

            for(int i= 0; i < n ;i++)
                System.out.print(array[i]+" ");

            System.out.println();


            t--;
        }

    }
}
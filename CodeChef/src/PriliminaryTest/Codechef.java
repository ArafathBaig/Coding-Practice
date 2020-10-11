package PriliminaryTest;

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

        while(t-- != 0){
            int n = scan.nextInt();

            if(isPrime(n)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

    private static boolean isPrime(int n){
        if(n==1)
            return false;

        for(int i = 2 ; i*i <= n ;i++){
            if(n%i == 0)
                return false;
        }

        return true;
    }
}

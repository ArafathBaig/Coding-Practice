package MinimumJumpsToReachEnd;

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

            for(int i = 0 ; i < n ;i++){
                a[i] = scan.nextInt();
            }

            int flag = 0;
            int count = 0;

            if(a[0] < n-1){
                for(int i = 0 ; i < n ;i++){

                    if(a[i] == 0){
                        flag = 1;
                        System.out.println("-1");
                        break;
                    }



                    int maxJump = a[i];
                    int k = i;
                    for(int j = i+1; j < n && j <= a[k]+k ; j++){

                        //  System.out.println(j+"  " + a[j]);

                        if(maxJump < a[j]+j){
                            i = j-1;
                            maxJump = a[j] + j;
                        }
                    }

                    // System.out.println("------>" + i);
                    count++;


                    if( maxJump >= n-1)
                        break;
                }
            }
            count++;

            if(flag == 0)
                System.out.println(count);
        }

    }
}
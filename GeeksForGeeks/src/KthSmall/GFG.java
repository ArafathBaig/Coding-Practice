package KthSmall;

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
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for(int i = 0 ; i < n;i++){
                a[i] = scan.nextInt();
            }

            int k = scan.nextInt();

            for(int i = 0 ; i < n;i++){

                maxHeap.add(a[i]);

                if(maxHeap.size() > k)
                    maxHeap.poll();
            }

            System.out.println(maxHeap.poll());



            t--;
        }

    }
}
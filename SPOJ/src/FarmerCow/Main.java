package FarmerCow;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-- != 0){

            int n  = scan.nextInt();
            int c = scan.nextInt();

            int a[] = new int[n];

            for(int i = 0  ; i < n ; i++){
                a[i] = scan.nextInt();
            }

            Arrays.sort(a);

            System.out.println(findMin(a,c));

        }
    }

    private static int findMin(int a[], int c){

        int left = a[0], right = a[a.length-1];
        int res = 0;
        while(left < right){

            int mid = left + (right - left)/2;

            if(isFeasible(mid,a,c)){
                res = Math.max(mid,res);
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return res;
    }

    private static boolean isFeasible(int mid, int a[], int k){

        int pos=a[0];

        int elements = 1;

        for(int i = 1 ; i < a.length ;i++){

            if(a[i] - pos >= mid){

                pos = a[i];
                elements++;

                if(elements == k)
                    return true;
            }
        }

        return false;
    }
}

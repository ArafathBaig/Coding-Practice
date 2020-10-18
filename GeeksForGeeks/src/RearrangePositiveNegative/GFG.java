package RearrangePositiveNegative;

import java.util.Arrays;
import java.util.Scanner;

public class GFG {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-- != 0){
            int n = scan.nextInt();

            int[] array = new int[n];

            for(int i = 0; i < n ;i++){
                array[i] = scan.nextInt();
            }

            rearrange(array, 0, n-1);

            System.out.println(Arrays.toString(array));
        }
    }

    private static void rearrange(int a[], int l , int r){
        if(l<r) {

            int m = l + (r - l) / 2;

            rearrange(a, l, m);
            rearrange(a, m + 1, r);

            merge(a, l, m, r);
        }
    }


    private static void merge(int a[], int l , int m , int r){

        int i = l;
        int j = m+1;

        while(i<=m && a[i] < 0)
            i++;

        while(j<=r && a[j] < 0)
            j++;

        reverse(a,i,m);

        reverse(a,m+1, j-1);

        reverse(a,i,j-1);
    }

    private static void reverse(int a[], int l , int r){

        for(int i = l,  j = 0 ; i <r-j ;i++,j++){
            int temp = a[i];
            a[i] = a[r-j];
            a[r-j] = temp;
        }
    }
}

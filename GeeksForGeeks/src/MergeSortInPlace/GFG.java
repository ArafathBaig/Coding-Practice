package MergeSortInPlace;

import java.util.Arrays;

public class GFG {

    public static void main(String[] args) {
        int[] a = {22,42,3,12,2,23,19,1};

        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int a[], int l , int r){

        if(l < r){
            int mid = (l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);

            merge(a,l,mid,r);
            System.out.println(Arrays.toString(a));
        }
    }

    private static void merge(int[] a, int l, int m, int r){

        int i = l, j = m+1;

        while(i <= m && j <= r){
            if(a[i] <= a[j]){
                i++;
            }else{
               int val = a[j];
               int ind = j;

               while(ind != i){
                   a[ind] = a[ind-1];
                   ind--;
               }
               a[i++] = val;
                m++;
                j++;
            }
        }


    }
}

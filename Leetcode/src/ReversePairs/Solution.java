package ReversePairs;

import java.util.Arrays;

class Solution {
    int count = 0;
    public int reversePairs(int[] nums) {
        count = 0;
        mergeAndCount(nums,0,nums.length-1);

        // System.out.println(Arrays.toString(nums));
        return count;
    }


    private void mergeAndCount(int a[], int l, int r){

        if(l<r){

            int m = l + (r-l)/2;

            mergeAndCount(a,l,m);

            mergeAndCount(a,m+1, r);

            merge(a,l,m,r);
        }

    }


    private  void merge(int a[], int l, int m , int r){

        int left[] = Arrays.copyOfRange(a,l,m+1);
        int right[] = Arrays.copyOfRange(a,m+1, r+1);

        int i =0, j =0;
        int k = l;

        while(i < left.length && j < right.length){

            if(left[i]<= (long) right[j]*2){
                i++;
            }else{
                count+= (m+1) - (l+i);
                j++;
            }
        }

        i = 0; j = 0;
        while(i < left.length && j < right.length){

            if(left[i] <= right[j]){
                a[k++] = left[i++];
            }
            else{
                a[k++] = right[j++];
            }

        }

        while(i<left.length)
            a[k++] = left[i++];

        while(j < right.length)
            a[k++] = right[j++];

    }
}
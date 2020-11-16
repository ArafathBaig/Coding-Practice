package ThreePartitions;

import java.util.Arrays;

class Solution{
    public void threeWayPartition(int a[], int k, int l)
    {

        // code here

        int s = 0, e = a.length - 1;

        for(int i = 0 ;i < a.length && s < e;i++){

            if(a[i] < k){
                swap(a,i,s);
                s++;
            }else if(a[i] > l){
                swap(a,i,e);
                e--;
            }
        }

        System.out.println(Arrays.toString(a));
    }

    private void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

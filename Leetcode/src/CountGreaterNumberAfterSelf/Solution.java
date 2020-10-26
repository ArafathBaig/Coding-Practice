package CountGreaterNumberAfterSelf;

import java.util.*;

class Solution {
    public List<Integer> countSmaller(int[] num) {

        int nums[] = num.clone();
        int count[] = new int[nums.length];

        mergeAndCount(nums, count, 0, nums.length-1);

        // System.out.println(Arrays.toString(count));
        // System.out.println(Arrays.toString(nums));

        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++){

            int n = nums[i];

            if(!map.containsKey(n))
                map.put(n, new PriorityQueue<>(Collections.reverseOrder()));

            map.get(n).add(count[i]);
        }

        for(int i = 0; i < nums.length;i++){

            count[i] = map.get(num[i]).poll();
        }

        List<Integer> list = new ArrayList<>();
        for(int n : count){
            list.add(n);
        }
        return list;

    }

    private void mergeAndCount(int a[], int c[], int l, int r){

        if(l<r){

            int m = l + (r-l)/2;

            // System.out.println(l+" "+m+" "+r);
            // System.out.println(Arrays.toString(a));
            // System.out.println(Arrays.toString(c));
            mergeAndCount(a,c,l,m);
            mergeAndCount(a,c,m+1,r);

            merge(a,c,l,m,r);
        }

    }

    private void merge(int a[], int c[], int l, int m , int r){

        int left[] = Arrays.copyOfRange(a,l,m+1);
        int right[] = Arrays.copyOfRange(a,m+1,r+1);

        int lc[] = Arrays.copyOfRange(c,l,m+1);
        int rc[] = Arrays.copyOfRange(c,m+1,r+1);

        int i= 0, j = 0, count = 0;
        int k = l,q = l, n = 0,p=0;
        while(i < left.length && j < right.length){

            if(left[i]<= right[j]){
                a[k++] = left[i++];
                c[q++] = count + lc[n++];
            }else{
                // System.out.println(right[i]);
                a[k++] = right[j++];
                c[q++] = rc[p++];
                count++;
            }
        }

        while(i < left.length){
            a[k++] = left[i++];
            c[q++] = count+lc[n++];
        }

        while(j < right.length){
            a[k++]  = right[j++];
            c[q++] = rc[p++];
        }
    }
}

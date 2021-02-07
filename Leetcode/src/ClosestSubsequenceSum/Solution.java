package ClosestSubsequenceSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int minAbsDifference(int[] nums, int goal) {

        int first = 0, m = nums.length/2, end = nums.length;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        subsum(nums,first,m,0,goal,list);
        subsum(nums,m,end,0,goal,list2);

        Collections.sort(list2);
        int ans = Math.abs(goal);
        for(int n : list){

            int key = goal - n;

            int l = 0, r = list2.size()-1;

            while(l <= r){

                int mid = l + (r-l)/2;

                if(list2.get(mid) == key){
                    return 0;
                }else if(list2.get(mid) > key){
                    r = mid-1;
                    ans = Math.min(ans, Math.abs(list2.get(mid) - key));
                }else{
                    l = mid+1;
                    ans = Math.min(ans, Math.abs(list2.get(mid) - key));
                }
            }
        }

        return ans;

    }

    private void subsum(int[] a, int index, int end, int sum, int goal, List<Integer> list){

        list.add(sum);
        if(index >= end){
            return;
        }

        for(int i = index; i < end; i++){
            subsum(a, i+1, end, sum+a[i], goal,list);
        }

    }
}
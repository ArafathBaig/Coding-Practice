package nextPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public void nextPermutation(int[] nums) {

        if(nums.length <= 1)
            return;

        int index = -1;
        int n = nums.length;
        int val = -1;
        for(int i = 0; i < n-1 ;i++){

            if(nums[i] < nums[i+1]){
                index = i;
                val = nums[i];
            }
        }

        if(index == -1){
            Arrays.sort(nums);
            return;
        }

        List<Integer> list = new ArrayList<>();
        list.add(val);
        int min = Integer.MAX_VALUE;
        for(int i = index+1; i < n ;i++){

            // System.out.println(nums[i]);
            if(val < nums[i]){
                min = Math.min(nums[i], min);
            }
            list.add(nums[i]);
        }

        Collections.sort(list);
        nums[index] = min;
        for(int i = index+1, j = 0 ; i < n && j < list.size(); i++,j++){

            // System.out.println(nums[i]+" "+list.get(j));
            if(list.get(j) == min){
                i--;
                min = 101;
                continue;
            }

            nums[i] = list.get(j);
        }


    }
}
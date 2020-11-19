package ContagiousArray;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int index = 0;
        int max =0;
        for(int i = 0 ; i < nums.length; i++){

            int n = nums[i];

            if(n == 0)
                index--;
            else
                index++;

            if(map.containsKey(index)){
                max = Math.max(max, i - map.get(index));
            }else{
                map.put(index,i);
            }
        }

        return max;
    }
}
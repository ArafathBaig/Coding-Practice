package TargetSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        Map<Map.Entry<Integer, Integer>,Integer> dp = new HashMap<>();

        return dp(nums,S,nums.length-1,0,dp);

    }

    private int dp(int[] nums, int target, int index, int curSum,Map<Map.Entry<Integer,Integer>, Integer> map){

        Map.Entry<Integer,Integer> entry = Map.entry(index,curSum);
        if(map.containsKey(entry)) return map.get(entry);

        if(index<0 && curSum==target) return 1;
        if(index<0) return 0;

        int pos = dp(nums,target,index-1,nums[index]+curSum, map);
        int neg = dp(nums,target,index-1,-nums[index]+curSum, map);

        entry = Map.entry(index,curSum);
        map.put(entry,pos+neg);

        return pos+neg;

    }
}
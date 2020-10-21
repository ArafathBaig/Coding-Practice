package MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1)
            return intervals;

        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));


        int [] current = intervals[0];
        list.add(current);
        for(int[] in : intervals){

            if(in[0]<=current[1]){
                current[1] = Math.max(in[1],current[1]);
            }else{
                current = in;
                list.add(current);
            }

        }

        return list.toArray(new int[list.size()][]);
    }
}
package threeSum;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ;i++){

            int j = nums.length-1, k = i+1;
            while(k<j){

                if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[k]);
                    temp.add(nums[j]);

                    list.add(temp);
                    j--;
                    k++;
                }else if(nums[i]+nums[j]+nums[k] > 0){
                    j--;
                }else{
                    k++;
                }
            }
        }

        return new ArrayList<>(list);
    }
}

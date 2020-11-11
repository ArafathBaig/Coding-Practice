package MaximumProductSubarray;

class Solution {
    public int maxProduct(int[] nums) {

        int prevMax = 1;
        int prevMin = 1;
        int max = Integer.MIN_VALUE;
        int tempMax = 1;

        for(int i = 0 ; i < nums.length; i++){


            tempMax = Math.max(nums[i], Math.max(tempMax*nums[i], prevMin*nums[i]));
            prevMin = Math.min(nums[i], Math.min(prevMin*nums[i], prevMax*nums[i]));
            prevMax = Math.max(nums[i], Math.max(prevMax*nums[i],tempMax));

            max = Math.max(max, tempMax);
        }

        max = Math.max(max, prevMax);
        return max;
    }
}
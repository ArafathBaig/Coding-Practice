class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = 0;
        int temp = -1000005;
        for(int i = 0; i < nums.length; i++){
            
            max = Math.max(nums[i], max+nums[i]);
            temp = Math.max(temp, max);
        }
        
        return temp;
    }
}
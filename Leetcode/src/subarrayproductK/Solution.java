package subarrayproductK;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(nums.length  == 0 || k <= 1) return 0;

        long prod = 1;
        int count= 0;
        int j = 0;
        for(int i = 0; i < nums.length ;i++){
            prod *= nums[i];

            while(prod>=k) prod /= nums[j++];

            count += i - j +1 ;
        }
        return count;
    }
}
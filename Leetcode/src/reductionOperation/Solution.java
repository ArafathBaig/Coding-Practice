class Solution {
    public int reductionOperations(int[] nums) {

        int res[] = new int[nums.length];
        int n = nums.length;

        Arrays.sort(nums);

        int count = 0;
        int prev = nums[0];
        int result = 0;
        for (int i = 1; i < n; i++) {

            if (prev == nums[i]) {
                result += count;
                continue;
            } else {
                count++;
                result += count;
                prev = nums[i];
            }
        }

        return result;
    }
}
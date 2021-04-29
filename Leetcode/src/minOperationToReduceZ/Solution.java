class Solution {
    public int minOperations(int[] nums, int x) {

        int sum = 0;

        for (int n : nums)
            sum += n;

        sum -= x;

        if (sum < 0)
            return -1;

        if (sum == 0)
            return nums.length;

        int temp = 0;

        int j = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {

            temp += nums[i];

            while (temp >= sum) {
                if (temp == sum)
                    max = Math.max(max, i - j + 1);

                temp -= nums[j++];
            }
        }

        return max == 0 ? -1 : nums.length - max;
    }
}
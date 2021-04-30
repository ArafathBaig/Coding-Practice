class Solution {
    public int longestOnes(int[] nums, int k) {
        int j = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            int curr = nums[i];

            if (curr == 0)
                k--;

            while (k < 0) {

                if (nums[j++] == 0)
                    k++;
            }

            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
class Solution {
    public void nextPermutation(int[] nums) {

        if (nums.length == 1)
            return;

        int j = nums.length - 1;

        while (j > 0 && nums[j - 1] >= nums[j--])
            ;

        if (j == 0 && nums[j] >= nums[j + 1]) {
            Arrays.sort(nums);
            return;
        }

        int min = 101;
        int swapIndex = j;

        // System.out.println(j);
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] > nums[j] && min > nums[i]) {
                min = Math.min(min, nums[i]);
                swapIndex = i;
            }
        }

        swap(nums, j, swapIndex);
        for (int i = j + 1; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] > nums[k])
                    swap(nums, i, k);
            }
        }
    }

    private void swap(int nums[], int j, int swapIndex) {
        int temp = nums[swapIndex];
        nums[swapIndex] = nums[j];
        nums[j] = temp;
    }
}
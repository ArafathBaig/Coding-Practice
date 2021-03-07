package MinimumElementsToAddToFormGivenSum;

class Solution {
    public int minElements(int[] nums, int limit, int goal) {

        long sum = 0;

        for(int n : nums)
            sum+= n;

        long diff = Math.abs(goal - sum);

        return diff%limit == 0 ? (int) (diff/limit) : (int) (diff/limit + 1);

    }
}
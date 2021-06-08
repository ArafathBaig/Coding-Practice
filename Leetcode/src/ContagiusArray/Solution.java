class Solution {
    public int findMaxLength(int[] nums) {

        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        map.put(0, 0);
        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];
            if (n == 0)
                count--;

            if (n == 1)
                count++;

            if (map.containsKey(count)) {
                max = Math.max(max, i - map.get(count) + 1);
            } else {
                map.put(count, i + 1);
            }
        }

        return max;
    }
}
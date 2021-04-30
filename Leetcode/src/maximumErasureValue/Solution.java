class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int j = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            int c = nums[i];
            sum += c;
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.get(c) > 1) {
                int d = nums[j++];
                sum -= d;
                map.put(d, map.get(d) - 1);
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}
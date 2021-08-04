class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap();

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i - j > k) {

                if (map.get(nums[j]) == j) {
                    map.remove(nums[j++]);
                }
            }

            if (map.containsKey(nums[i]))
                return true;

            map.put(nums[i], i);

        }

        return false;
    }
}
class Solution {
    public int minSubArrayLen(int t, int[] n) {

        int j = 0;
        int sum = 0;
        int min = n.length + 1;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];

            while (sum >= t) {
                min = Math.min(min, i - j + 1);
                sum -= n[j++];
            }

        }

        return min == n.length + 1 ? 0 : min;
    }
}
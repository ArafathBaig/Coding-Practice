package MaximumAbsoluteSum;

class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int posMax = 0;
        int negMax = 0;

        int max = Integer.MIN_VALUE;
        for(int n: nums){
            int neg = -n;

            posMax = Math.max(n, n+posMax);
            negMax = Math.min(n, n + negMax);

            // System.out.println(posMax + " "+negMax);
            max = Math.max( max, Math.max(Math.abs(posMax), Math.abs(negMax)));
        }

        return max;

    }
}
package maxSumCircularArray;

class Solution {
    public int maxSubarraySumCircular(int[] a) {

        int maxSum = -10000000, curSum = 0,  minSum=10000000,  curMin = 0,  total = 0;


        for(int n : a){

            curSum = Math.max(curSum+n, n);
            maxSum = Math.max(curSum, maxSum);
            curMin = Math.min(curMin+n, n);
            minSum = Math.min(curMin, minSum);

            total += n;
        }

        return maxSum > 0 ? Math.max(maxSum, total-minSum) : maxSum;
    }
}
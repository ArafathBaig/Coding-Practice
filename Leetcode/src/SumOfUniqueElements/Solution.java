package SumOfUniqueElements;

class Solution {
    public int sumOfUnique(int[] nums) {
        int a[] = new int[101];

        for(int n : nums){
            a[n]++;
        }

        int sum = 0;
        for(int n : nums){

            if(a[n] == 1)
                sum+=n;
        }

        return sum;
    }
}
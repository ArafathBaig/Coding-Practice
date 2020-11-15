package MajorityElement;
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for(int i = 1 ; i < nums.length ;i++){

            int n= nums[i];
            if(candidate == n){
                count++;
            } else{
                count--;

                if(count == 0){
                    candidate = n;
                    count=1;

                }
            }
        }
        return candidate;
    }
}

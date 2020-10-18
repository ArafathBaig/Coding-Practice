package SortColor;

class Solution {
    public void sortColors(int[] nums) {

        int z =0 , t = nums.length-1, o = 0;

        while(o<=t){

            if(nums[o] == 2){
                swap(o,t,nums);
                t--;
            }else if(nums[o] == 0){
                swap(o,z,nums);
                z++;
                o++;
            }else{
                o++;
            }
        }
    }

    private void swap(int i, int j, int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
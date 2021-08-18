class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 1, current = nums[0], prev = -100000;
        int i = 1, j = 1;
        int n = nums.length;
        
        while(i < n && j < n){
        
            if(current == nums[j]){
                count++;
            }else{
                prev = current;
                current = nums[j];
                count = 1;
            }
            
            if(count <= 2)
                nums[i++] = nums[j];
            
            j++;
        }
        
        return i;
    }
}
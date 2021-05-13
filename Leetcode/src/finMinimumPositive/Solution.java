class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        
        for(int i = 0 ; i < n ;i++){
            
            if(nums[i] > n || nums[i] <= 0)
                nums[i] = n+1;
        }
        
        for(int i = 0; i < n ;i++){
            
            int t = Math.abs(nums[i]);
            if(t <= n && t > 0){
                nums[t-1] = -Math.abs(nums[t-1]); 
            }
        }
        
        int ans = n+1;
        
         //System.out.println(Arrays.toString(nums));
        for(int i = 0 ; i < n; i++){
            
            
            if(nums[i] > 0)
                return i+1;
        }
        
        return ans;
    }
}public class Solution {
    
}

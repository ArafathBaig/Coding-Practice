class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        if(nums.length == 1 ||nums.length == 0) return false;
        
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums){
            
            if(!set.isEmpty() && set.contains(n)) return true;
            
            set.add(n);
        }
        
        return false;
    }
}
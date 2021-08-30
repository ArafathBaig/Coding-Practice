class Solution {
    String ans = "";
    public String findDifferentBinaryString(String[] nums) {
        
        ans = "";
        Set<String> set = new HashSet<>();
        
        for(String s: nums)
            set.add(s);
        
        possibleChecks("", set, nums[0].length());
        
        return ans;
        
    }
    private boolean possibleChecks(String tempAns, Set<String> set, int n){
        
        if(tempAns.length() == n){
            if(!set.contains(tempAns)){
                ans = tempAns;
                return true;
            }
            
            return false;
        }
        
        return possibleChecks(tempAns+"0", set, n) || possibleChecks(tempAns+"1", set, n);
    }
}
class Solution {
    public int minTimeToType(String word) {
        
        int pointer = 1;
        int ans = 0;
        for(int i =0; i < word.length(); i++){
            
            int val = word.charAt(i) - 'a' +1;
            
            int rot = Math.min(26-val+pointer, 26-pointer+val);
            ans += Math.min(rot, Math.abs(val - pointer))+1;
            // System.out.println(ans);
            pointer = val;
        }
        
        return ans;
    }
}
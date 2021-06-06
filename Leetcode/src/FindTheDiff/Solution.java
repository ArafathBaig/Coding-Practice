class Solution {
    public char findTheDifference(String s, String t) {
        
        int diff = 0;
        
        for(int i = 0; i < s.length() ;i++){
            diff += t.charAt(i);
            diff -= s.charAt(i);
        }
        
        diff += t.charAt(t.length()-1);
        
        return (char) diff;
    }
}
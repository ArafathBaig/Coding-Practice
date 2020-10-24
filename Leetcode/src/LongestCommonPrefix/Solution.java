package LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        if(strs.length == 0) {
            return result;
        }
        int charIndex = 0;
        for(char c : strs[0].toCharArray()){
            for(int i = 1; i < strs.length;i++){
                if(charIndex >= strs[i].length() || c != strs[i].charAt(charIndex)){
                    return result;
                }
            }
            result+=c;
            charIndex++;
        }
        return result;
    }
}
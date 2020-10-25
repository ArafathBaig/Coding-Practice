package LongestSubstringWithDistinctCharacters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int i = 0;
        int n= s.length(), max = 0;
        for(int j = 0; j<n ;j++){

            char c = s.charAt(j);

            while(!set.isEmpty() && set.contains(c))
                set.remove(s.charAt(i++));

            set.add(c);
            max = Math.max(max, j-i+1);

        }

        return max;
    }
}
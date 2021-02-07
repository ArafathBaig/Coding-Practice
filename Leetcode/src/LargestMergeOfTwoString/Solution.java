package LargestMergeOfTwoString;

class Solution {
    public String largestMerge(String s, String t) {

        if(s.length() == 0 || t.length() == 0){
            return s+t;
        }

        if(s.compareTo(t) > 0)
            return s.charAt(0) + largestMerge(s.substring(1,s.length()), t);

        return t.charAt(0) + largestMerge(s, t.substring(1, t.length()));
    }
}
package IsomorphicStrings;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length() ; i++){

            char source = s.charAt(i);
            char target = t.charAt(i);

            if(!map.containsKey(source) && !map.containsValue(target)){
                map.put(source,target);
            }else if(map.getOrDefault(source,' ') != target){
                return false;
            }
        }
        return true;
    }
}

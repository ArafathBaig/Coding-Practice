package PermutationInAString;

class Solution {
    public boolean checkInclusion(String s, String t) {

        Map<Character, Integer> map= new HashMap<>();

        for(int i= 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c,0)+1);
        }

        int candidate = map.size(), j = 0, max = 10001;

        for(int i = 0; i < t.length() ;i++){

            char c = t.charAt(i);

            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);

                if(map.get(c) == 0)
                    candidate--;
            }

            while(candidate == 0){

                max= Math.min(i-j+1, max);
                char d = t.charAt(j++);

                if(map.containsKey(d)){
                    map.put(d, map.get(d)+1);

                    if(map.get(d) == 1)
                        candidate++;
                }
            }
        }

        return max == s.length();
    }
}
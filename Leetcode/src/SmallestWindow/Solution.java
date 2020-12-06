package SmallestWindow;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        int m = s.length();
        int n = p.length();
        for(int i = 0; i < n ;i++){
            char c = p.charAt(i);

            if(!map.containsKey(c))
                map.put(c,0);

            map.put(c,map.get(c)+1);
        }

        int candidate = map.size();

        int i = 0;
        int max = Integer.MAX_VALUE;
        String res = "";
        for(int j = 0; j < m ; j++){
            char c = s.charAt(j);

            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);

                if(map.get(c)==0)
                    candidate--;
            }


            while(candidate == 0){

                if(max > j-i+1){
                    res = s.substring(i,j+1);
                    max = j-i+1;
                }

                char t = s.charAt(i++);

                if(map.containsKey(t)){
                    map.put(t, map.get(t)+1);

                    if(map.get(t)>0)
                        candidate++;
                }

            }
        }

        return res;
    }
}

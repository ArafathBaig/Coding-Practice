package DiffKpair;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] a, int K) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : a){
            map.put(n, map.getOrDefault(n,0)+1);
        }


        int count = 0;
        for(int n : map.keySet()){
            if(K==0){

                if(map.get(n)>=2){
                    count++;
                }
            }else{

                if(map.containsKey(K + n))
                    count++;
            }
        }

        return count;
    }

}
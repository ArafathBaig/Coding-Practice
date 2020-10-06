package UniqueBinarySearchTrees1;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Integer, Integer> map = new HashMap<>();
    public int numTrees(int n) {

        if(n <= 0)
            return 1;

        if(map.containsKey(n))
            return map.get(n);

        int sum = 0;
        for(int i  = 1; i <= n;i++){
            int left = numTrees(i-1);
            int right = numTrees(n-i);

            sum += left* right;
        }

        map.put(n, sum);
        return sum;
    }
}
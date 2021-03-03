package reducingDishes;

import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] s) {

        Arrays.sort(s);

        int tot = 0;
        int sum = 0;

        for(int i = s.length-1; i >= 0 ;i--){

            tot += s[i];

            if(tot <= 0)
                break;

            sum += tot;
        }

        return sum;
    }
}
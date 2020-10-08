package PermutationSequence;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String getPermutation(int n, int k) {

        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet();
        int t = n;
        k--;
        while(t!=0){
            t--;
            int num = fact(t);
            int digit = k/num;
            k = k%(num);

            for(int i = 1 ; i<=n ;i++){

                if(digit == 0 && !set.contains(i)){
                    set.add(i);
                    sb.append(i);
                    break;
                }

                if(!set.contains(i)){
                    digit--;
                }
            }
        }

        return sb.toString();

    }

    private int fact(int n) {

        int ans = 1;

        for(int i = 2; i <= n ;i++){
            ans *= i;
        }

        return ans;
    }
}
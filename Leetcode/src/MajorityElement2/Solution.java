package MajorityElement2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2=0, n1 = -1, n2 = -1;

        for(int n : nums){

            if(n1 == n)
                c1++;
            else if(n2==n)
                c2++;
            else if(c1==0){
                n1 = n;
                c1 = 1;
            }
            else if(c2 == 0){
                n2 =n;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }

        }

        c1=0;
        c2=0;

        for(int n : nums){

            if(n1 == n)
                c1++;

            if(n2==n)
                c2++;
        }

        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        if(c1 > n/3)
            list.add(n1);

        if(c2>n/3)
            list.add(n2);

        if(n1 == n2)
            list.remove(list.size()-1);

        return list;
    }
}
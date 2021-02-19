package Shopping;

import java.util.*;

class Solution {
    int max = 0;
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {

        for(int i = 0  ; i < price.size() ;i++){
            max += price.get(i) * needs.get(i);
        }


        int n = price.size();
        for(int i = 0; i < price.size() ;i++){

            Integer[] a = new Integer[n+1];
            Arrays.fill(a,0);

            a[i] = 1;
            a[n] = price.get(i);

            special.add(Arrays.asList(a));
        }

        for(List<Integer> list : special)
            System.out.println(list);

        Map<String, Integer> map = new HashMap<>();

        return recursion(price,special,needs,map,special.size()-1);
    }

    private int recursion(List<Integer> p, List<List<Integer>> sp, List<Integer> ne, Map<String, Integer> map,int i){

        if(i < 0)
            return max;

        List<Integer> temp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        StringBuilder s = new StringBuilder();

        for(int n : ne){
            s.append(n).append(",");
        }

        if(map.containsKey(s.toString()))
            return map.get(s.toString());

        for(int j = 0; j < sp.get(i).size()-1; j++){


            System.out.println(ne.get(j) + " " + sp.get(i).get(j));
            if(ne.get(j) < sp.get(i).get(j)){
                int val = recursion(p,sp,ne,map,i-1);
                map.put(s.toString(),val);
                return val;
            }

            temp.add(ne.get(j)-sp.get(i).get(j));
        }

        System.out.println(temp + " " + s);

        int val = Math.min(sp.get(i).get(sp.get(i).size()-1) + recursion(p,sp,temp,map,i) , recursion(p,sp,ne,map,i-1) );

        map.put(s.toString(), val);

        return val;

    }
}

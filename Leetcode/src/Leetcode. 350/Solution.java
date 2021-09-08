class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length == 0 || nums2.length ==0) return new int[0];
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums1){
            map.put(n , map.getOrDefault(n,0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int n : nums2){
            if(map.containsKey(n) && map.get(n) > 0){
                list.add(n);
                map.put(n, map.get(n)-1);
            }
        }
        
        int a[] = new int[list.size()];
        for(int k = 0 ; k < list.size(); k++){
            a[k] = list.get(k);
        }
        return a;
        
        
    }
}
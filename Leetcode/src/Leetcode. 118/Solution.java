class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;
        
        list.add(new ArrayList<>());
        list.get(0).add(1);
        
        for(int i = 1 ; i < numRows ; i++){
            
            List<Integer> listt = new ArrayList<>();
            List<Integer> prev = list.get(list.size()-1);
            
            listt.add(1);
            
            for(int j = 1 ; j< i ;j++){
                listt.add(prev.get(j-1)+prev.get(j));
            }
            
            listt.add(1);
            list.add(new ArrayList<>(listt));
        }
        
        return list;
    }
}
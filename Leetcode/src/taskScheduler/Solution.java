class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : tasks)
            map.put(c, map.getOrDefault(c,0)+1);
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        
        for(char c : map.keySet()){
            maxHeap.add(c);
        }
        
        int time = 0;
        
        while(!maxHeap.isEmpty()){
            
            int i = 0;
            
            List<Character> list = new ArrayList<>();
            do{
                
                if(maxHeap.size() == 0 && list.size() == 0)
                    break;
                
                if(maxHeap.size() == 0){
                    time+= n-i+1;
                    break;
                }
                
                char c = maxHeap.poll();
                
                map.put(c,map.get(c)-1);
                
                if(map.get(c) != 0)
                    list.add(c);
                
                time++;
                i++;
            }while(i< n+1);
            
            // System.out.println(time);
            for(char c: list)
                maxHeap.add(c);
            
        }
        return time;
    }
}